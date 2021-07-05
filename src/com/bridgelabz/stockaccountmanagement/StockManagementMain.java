package com.bridgelabz.stockaccountmanagement;

import java.util.Scanner;

public class StockManagementMain {
    /**
     * asking user for the choice calling the method accordingly.
     * @param args
     */
    public static void main(String[] args) {
        StockManagementInterface stockManagement = new StockManagement();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter your choice 1.add 2.display 3.value of stock 4.exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter  how many Stocks you want to add :");
                    int numberOfStocks = scanner.nextInt();
                    for (int index = 0; index < numberOfStocks; index++) {
                        Stocks stocks = new Stocks();
                        System.out.println("Enter the name of Stock:");
                        stocks.setStockName(scanner.next());
                        System.out.println("enter number of shares you are buying: ");
                        stocks.setNumOfShare(scanner.nextInt());
                        System.out.println("Enter the price per share ");
                        stocks.setSharePrice(scanner.nextDouble());
                        stockManagement.addStock(stocks);
                    }
                    break;
                case 2:
                    stockManagement.displayStocks();
                    break;
                case 3:
                    System.out.println("the value of stocks are :");
                    stockManagement.calculateStockValue();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("enter between 1 to 3 only");
            }
        }
    }
}
