package com.company;

import com.company.dao.impl.Lottery;
import com.company.dao.impl.LotteryImpl;
import com.company.dao.model.LotteryModel;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new LotteryImpl();

    }
    public static void fillLottery(Lottery lottery){
        lottery.createLottery();
        for () {
            lottery.createPrize();
        }
        lottery.createTickets();
    }
    public static void rozigrish(Lottery lottery, LotteryModel lotteryModel){
        lottery.getAllTicketsByLottery();
        lottery.getAllPrizeByLottery();
    }
}
