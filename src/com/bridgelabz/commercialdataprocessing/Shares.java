package com.bridgelabz.commercialdataprocessing;

import java.util.Date;

public class Shares {
    private String stockName;
    private String companySymbol;
    private int numOfShare;
    private double sharePrice;
    Date date;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getCompanySymbol() {
        return companySymbol;
    }

    public void setCompanySymbol(String companySymbol) {
        this.companySymbol = companySymbol;
    }

    public int getNumOfShare() {
        return numOfShare;
    }

    public void setNumOfShare(int numOfShare)
    {
        if(numOfShare < 0)
        {
            System.out.println("number of shares should above zero");
        }
        else
        {
            this.numOfShare = numOfShare;
        }
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        if(sharePrice < 0)
        {
            System.err.println("share price should be above zero");
        }
        else
        {
            this.sharePrice = sharePrice;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Shares{" +
                "stockName='" + stockName + '\'' +
                ", companySymbol='" + companySymbol + '\'' +
                ", numOfShare=" + numOfShare +
                ", sharePrice=" + sharePrice +
                ", date=" + date +
                '}';
    }
}