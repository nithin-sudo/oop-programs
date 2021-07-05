package com.bridgelabz.stockaccountmanagement;

public class Stocks {
    /**
     * generating getters and setters.
     */
    private String stockName;
    private int numOfShare;
    private double sharePrice;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumOfShare() {
        return numOfShare;
    }

    public void setNumOfShare(int numOfShare) {
        if (numOfShare < 0) {
            System.err.println("number of shares should be above 0 ");
        } else {
            this.numOfShare = numOfShare;
        }
    }

    public double getSharePrice() {
        return sharePrice;
    }


    public void setSharePrice(double sharePrice) {
        if (sharePrice < 0.0) {
            System.err.println("share price should be above 0 ");
        } else {
            this.sharePrice = sharePrice;
        }
    }
    @Override
    public String toString() {
        return "Stocks{" +
                "stockName='" + stockName + '\'' +
                ", numOfShare=" + numOfShare +
                ", sharePrice=" + sharePrice +
                '}';
    }
}
