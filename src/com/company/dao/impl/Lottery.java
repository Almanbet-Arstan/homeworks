package com.company.dao.impl;

import com.company.dao.model.LotteryModel;
import com.company.dao.model.PrizeModel;
import com.company.dao.model.TicketModel;

import java.util.List;

public interface Lottery {
    // Создание лотореи
    LotteryModel createLottery(LotteryModel lotteryModel);
    PrizeModel createPrize (LotteryModel lotteryModel, PrizeModel prizeModel);
    boolean createTickets(List<TicketModel> tickets);


    // Распространение билетов
    boolean sellTicket(Integer ticketId);

    // Розыгрыш призов
    boolean chooseWinner(TicketModel ticketModel, PrizeModel prizeModel);

    List<TicketModel> getAllTicketsByLottery(LotteryModel lotteryModel);

    List<PrizeModel> getAllPrizeByLottery(LotteryModel lotteryModel);

}
