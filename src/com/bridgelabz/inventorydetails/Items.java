package com.bridgelabz.inventorydetails;

public class Items {
    private String nameOfItem;
    private double weightOfItem;
    private double priceOfItemPerKg;

    /**
     * generating getters and setters.
     * @return
     */
    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public double getWeightOfItem() {
        return weightOfItem;
    }

    public void setWeightOfItem(double weightOfItem) {
        if(weightOfItem < 0.0)
        {
            System.err.println("weight always should be above 0 ");
        }
        else
        {
            this.weightOfItem = weightOfItem;
        }

    }

    public double getPriceOfItemPerKg() {
        return priceOfItemPerKg;
    }

    public void setPriceOfItemPerKg(double priceOfItemPerKg) {
        if(priceOfItemPerKg < 0.0)
        {
            System.err.println("Price always should be above 0 ");
        }
        else
        {
            this.priceOfItemPerKg = priceOfItemPerKg;
        }
    }

    @Override
    public String toString() {
        return "Items{" +
                "nameOfItem='" + nameOfItem + '\'' +
                ", weightOfItem=" + weightOfItem +
                ", priceOfItemPerKg=" + priceOfItemPerKg +
                '}';
    }
}
