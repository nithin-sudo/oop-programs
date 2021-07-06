package com.bridgelabz.commercialdataprocessing;

public interface StockAccountInterface {
    public void displayStockAndSymbol();
    public void buyCompanyStocks(Shares shares );
    public void sellCompanyStocks(String companySymbol);
    public void displayStocks();
}
