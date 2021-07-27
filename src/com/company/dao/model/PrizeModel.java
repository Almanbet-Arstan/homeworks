package com.company.dao.model;

public class PrizeModel {
    private Integer id;
    private String name;
    private Float price;
    private Boolean isWin;
    private Integer lotteryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Boolean getWin() {
        return isWin;
    }

    public void setWin(Boolean win) {
        isWin = win;
    }

    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
