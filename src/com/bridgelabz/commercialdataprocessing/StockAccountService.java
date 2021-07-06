package com.bridgelabz.commercialdataprocessing;

import java.util.LinkedList;

public class StockAccountService implements StockAccountInterface{
    LinkedList<Shares> sharesLinkedList = new LinkedList<>();
    /**
     * displaying company name and company symbol.
     */
    @Override
    public void displayStockAndSymbol() {
        System.out.println("Company Stocks and symbols");
        System.out.println("Reliance : Ril" );
        System.out.println("Cipla : Cipla");
        System.out.println("Adani-Power : ADP");
    }
    /**
     *buying company stocks.
     * @param shares
     */
    @Override
    public void buyCompanyStocks(Shares shares)
    {
        sharesLinkedList.add(shares);
    }

    /**
     * selling company stocks.
     * @param companySymbol
     */
    @Override
    public void sellCompanyStocks(String companySymbol)
    {
        for(Shares shares : sharesLinkedList)
        {
            if(shares.getCompanySymbol().equals(companySymbol))
            {
                sharesLinkedList.remove(shares);
                System.out.println("stock sold ");
            }
        }
    }
    /**
     * displaying the stocks in the linked list.
     */
    @Override
    public void displayStocks() {
        for(Shares shares : sharesLinkedList)
        {
            System.out.println(shares);
        }
    }




}
