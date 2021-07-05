package com.bridgelabz.stockaccountmanagement;

import java.util.LinkedList;

public class StockManagement implements StockManagementInterface {
    LinkedList<Stocks> stocksLinkedList = new LinkedList<>();
    /**
     * adding the stocks to the linked list.
     * @param stocks
     */
    @Override
    public void addStock(Stocks stocks) {
        if(stocksLinkedList.contains(stocks))
        {
            System.err.println("Stock already exist ");
        }
        else
        {
            stocksLinkedList.add(stocks);
        }
    }
    /**
     * displaying the stocks in the linked list
     */
    @Override
    public void displayStocks() {
        for(Stocks stocks : stocksLinkedList)
        {
            System.out.println(stocks);
        }
    }

    /**
     * calculating the stock value and total stock value.
     */
    @Override
    public void calculateStockValue() {
        double totalValueOfStock = 0;
        for(Stocks stocks : stocksLinkedList)
        {
            double valueOfStock = stocks.getNumOfShare()*stocks.getSharePrice();
            System.out.println("value of stock "+stocks.getStockName()+"is "+valueOfStock);
            totalValueOfStock = totalValueOfStock +valueOfStock;
            System.out.println("the total value of stocks is "+totalValueOfStock);
        }
    }

}
