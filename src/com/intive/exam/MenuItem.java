package com.intive.exam;

public class MenuItem {
    private String itemName;
    private String itemDescription;
    private double itemPrice;

    public MenuItem(final String itemName, final String itemDescription, final double itemPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getItemPrice() {return itemPrice;}

}
