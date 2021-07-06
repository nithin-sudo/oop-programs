package com.bridgelabz.commercialdataprocessing;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class StockAccountMain {
    static Scanner scanner = new Scanner(System.in);
    static Date date = Calendar.getInstance().getTime();

    /**
     * asking user his choice and calling the method accordingly.
     * @param args
     */
    public static void main(String[] args) {
        StockAccountInterface stockManagement = new StockAccountService();
        boolean exit = false;
        while (!exit) {
            stockManagement.displayStockAndSymbol();
            System.out.println("Enter your choice 1.buy company stock 2.sell company stock 3.display 4.exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter  how many Stocks you want to buy :");
                    int numberOfStocks = scanner.nextInt();
                    for (int index = 0; index < numberOfStocks; index++)
                    {
                        Shares shares = new Shares();
                        System.out.println("Enter the name of Stock:");
                        shares.setStockName(scanner.next());
                        System.out.println("enter stock symbol");
                        shares.setCompanySymbol(scanner.next());
                        System.out.println("Enter the price per share ");
                        double sharePrice = scanner.nextDouble();
                        shares.setSharePrice(sharePrice);
                        System.out.println("enter the amount you want to buy stocks for :");
                        double amount = scanner.nextDouble();
                        int sharesForCompany = (int)(amount / sharePrice);
                        shares.setNumOfShare(sharesForCompany);
                        shares.setDate(date);
                        stockManagement.buyCompanyStocks(shares);
                    }
                    System.out.println("All stocks bought");
                    break;
                case 2:
                    System.out.println("enter the stock symbol to sell:");
                    stockManagement.sellCompanyStocks(scanner.next());
                    break;
                case 3:
                    stockManagement.displayStocks();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("enter between 1 to 4 only");
            }
        }
    }
}
