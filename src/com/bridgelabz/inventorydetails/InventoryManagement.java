package com.bridgelabz.inventorydetails;

import java.util.LinkedList;

public class InventoryManagement implements InventoryManagementInterface {
    LinkedList<Items> itemsLinkedList = new LinkedList<>();

    /**
     * adding the items to the linked list.
     * @param items
     */
    @Override
    public void addItem(Items items) {
        if(itemsLinkedList.contains(items))
        {
            System.err.println("item already exists!");
        }
        else
        {
            itemsLinkedList.add(items);
        }

    }

    /**
     * displaying the items in the linked list.
     */
    @Override
    public void displayItems() {
        for (Items item : itemsLinkedList)
        {
          System.out.println(item);
        }
    }

    /**
     * displaying the item by taking name from the user.
     * @param nameOfItem
     */
    @Override
    public void displayItemsByName(String nameOfItem) {
        for (Items item : itemsLinkedList)
        {
            if(item.getNameOfItem().equals(nameOfItem))
            {
                System.out.println(item);
                break;
            }
        }
    }

    /**
     * calculating the value of item.
     */
    @Override
    public void calculateItemValue() {
        for(Items items : itemsLinkedList)
        {
            double valueOfItem = items.getWeightOfItem()* items.getPriceOfItemPerKg();
            System.out.println("Value of item "+items.getNameOfItem()+" is "+valueOfItem);
        }
    }
}
