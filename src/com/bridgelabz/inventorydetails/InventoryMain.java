package com.bridgelabz.inventorydetails;

import java.util.Scanner;

public class InventoryMain {
    /**
     * asking user to enter their choice and calling methods accordingly.
     * @param args
     */
    public static void main(String[] args) {
        InventoryManagementInterface inventoryManagement =  new InventoryManagement();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit)
        {
            System.out.println("enter your choice 1.add 2.display 3.displays items  by name 4. calculate value of item 5.exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter  how many items you want to add :");
                    int numberOfItems = scanner.nextInt();
                    for(int index = 0; index < numberOfItems; index++)
                    {
                        Items items = new Items();
                        System.out.println("Enter the name of item:");
                        items.setNameOfItem(scanner.next());
                        System.out.println("enter the weight of item : ");
                        items.setWeightOfItem(scanner.nextDouble());
                        System.out.println("Enter price of item per kg ");
                        items.setPriceOfItemPerKg(scanner.nextDouble());
                        inventoryManagement.addItem(items);
                    }
                    break;
                case 2:
                    inventoryManagement.displayItems();
                    break;
                case 3:
                    System.out.println("enter the name of the item you want to fetch :");
                    String nameOfItem = scanner.next();
                    inventoryManagement.displayItemsByName(nameOfItem);
                    break;
                case 4:
                    System.out.println("the value of items are :");
                    inventoryManagement.calculateItemValue();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("enter between 1 to 5 only");
            }
        }
    }
}
