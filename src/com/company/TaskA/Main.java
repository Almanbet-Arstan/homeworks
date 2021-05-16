package com.company.TaskA;

public class Main {
    public static void main(String[] args) {
        Credit credit1 = new Credit(1, 15000, 5, 2.3f);
        Credit credit2 = new Credit(2, 5000, 2, 2.3f);
        Credit credit3 = new Credit(3, 32000, 9, 2.3f);
        Credit credit4 = new Credit(4, 1000, 1, 2.3f);
        Credit credit5 = new Credit(5, 350000, 18, 2.3f);
        System.out.printf("Количество выданных кредитов = %d, общая сумма выданных кредитов = %d, средняя сумма всех кредитов = %d.", Credit.getNumOfGivenCredits(), Credit.getTotalSumOfAllCredits(), Credit.getAverageSumOfAllCredits());
    }
}
