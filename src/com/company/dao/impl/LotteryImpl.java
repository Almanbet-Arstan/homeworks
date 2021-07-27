package com.company.dao.impl;

import com.company.dao.model.LotteryModel;
import com.company.dao.model.PrizeModel;
import com.company.dao.model.TicketModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LotteryImpl implements Lottery{
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "a1l2m3a4";

    public Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    @Override
    public LotteryModel createLottery(LotteryModel lotteryModel) {
        ResultSet resultSet = null;
        try (Connection connection = connect();
        PreparedStatement statement = connection.prepareStatement("insert into lottery(name, description, date_start, date_end)\n" +
                "values (?, ?, ?, ?)")){
            statement.setString(1, lotteryModel.getName());
            statement.setString(2, lotteryModel.getDescription());
            statement.setTimestamp(3, lotteryModel.getStartDate());
            statement.setTimestamp(4, lotteryModel.getEndDate());
            statement.executeUpdate();
            resultSet = statement.executeQuery();
            if (resultSet.next()){
                lotteryModel.setId(resultSet.getInt(1));
            }
            return lotteryModel;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public PrizeModel createPrize(LotteryModel lotteryModel, PrizeModel prizeModel) {
        ResultSet resultSet = null;
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("insert into prizes(name, price, is_win, lottery_id)\n" +
                     "values (?, ?, ?, ?)")){
            statement.setString(1, prizeModel.getName());
            statement.setFloat(2, prizeModel.getPrice());
            statement.setBoolean(3, prizeModel.getWin());
            statement.setInt(4, prizeModel.getLotteryId());
            statement.executeUpdate();
            resultSet = statement.executeQuery();
            if (resultSet.next()){
                prizeModel.setId(resultSet.getInt(1));
            }
            return prizeModel;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public boolean createTickets(List<TicketModel> tickets) {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("insert into tickets(ticket_number, is_sold, lottery_id)\n" +
                     "values (?, ?, ?)")){
            for (TicketModel ticket:tickets) {
                statement.setInt(1, ticket.getTicketNumber());
                statement.setBoolean(2, ticket.getSold());
                statement.setInt(3, ticket.getLotteryId());
                try {
                    statement.executeUpdate();
                }catch (SQLException e){
                    System.out.println(e);
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean sellTicket(Integer ticketId) {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("update tickets\n" +
                     "set is_sold = ?\n" +
                     "where id = ?")){
            statement.setBoolean(1, true);
            statement.setInt(2, ticketId);
            int count = statement.executeUpdate();
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean chooseWinner(TicketModel ticketModel, PrizeModel prizeModel) {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("insert into winners(ticket_id, prize_id, win_date)\n" +
                     "values (?, ?, ?)")){
            statement.setInt(1, ticketModel.getId());
            statement.setInt(2, prizeModel.getId());
            statement.setTimestamp(3, new Timestamp(21, 7, 27, 4, 37, 50, 10689));
            int count = statement.executeUpdate();
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<TicketModel> getAllTicketsByLottery(LotteryModel lotteryModel) {
        ResultSet resultSet = null;
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("select id, ticket_number, is_sold, lottery_id from tickets \n" +
                     "where lottery_id = ?")){
            statement.setInt(1, lotteryModel.getId());
            resultSet = statement.executeQuery();
            List<TicketModel> tickets = new ArrayList<>();
            while (resultSet.next()){
                TicketModel ticketModel = new TicketModel();
                ticketModel.setLotteryId(resultSet.getInt("lottery_id"));
                ticketModel.setId(resultSet.getInt("id"));
                ticketModel.setTicketNumber(resultSet.getInt("ticket_number"));
                ticketModel.setSold(resultSet.getBoolean("is_sold"));
                tickets.add(ticketModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
