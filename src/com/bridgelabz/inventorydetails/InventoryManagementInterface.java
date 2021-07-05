package com.bridgelabz.inventorydetails;

public interface InventoryManagementInterface {
    public void addItem(Items items);
    public void displayItems();
    public void displayItemsByName(String nameOfItem);
    public void calculateItemValue();
}
