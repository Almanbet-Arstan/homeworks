package com.company.TaskA;

public class Credit {
    private int id;
    private int sum;
    private int period;
    private float interestRate;
    private static int numOfGivenCredits;
    private static int totalSumOfAllCredits;
    private static int averageSumOfAllCredits;

    public Credit(int id, int sum, int period, float interestRate) {
        this.id = id;
        this.sum = sum;
        this.period = period;
        this.interestRate = interestRate;
        numOfGivenCredits++;
        totalSumOfAllCredits += sum;
        averageSumOfAllCredits = totalSumOfAllCredits / numOfGivenCredits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public static int getNumOfGivenCredits() {
        return numOfGivenCredits;
    }

    public static void setNumOfGivenCredits(int numOfGivenCredits) {
        Credit.numOfGivenCredits = numOfGivenCredits;
    }

    public static int getTotalSumOfAllCredits() {
        return totalSumOfAllCredits;
    }

    public static void setTotalSumOfAllCredits(int totalSumOfAllCredits) {
        Credit.totalSumOfAllCredits = totalSumOfAllCredits;
    }

    public static int getAverageSumOfAllCredits() {
        return averageSumOfAllCredits;
    }

    public static void setAverageSumOfAllCredits(int averageSumOfAllCredits) {
        Credit.averageSumOfAllCredits = averageSumOfAllCredits;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "id=" + id +
                ", sum=" + sum +
                ", period=" + period +
                ", interestRate=" + interestRate +
                '}';
    }
}
