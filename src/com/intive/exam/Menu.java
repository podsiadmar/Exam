package com.intive.exam;


import java.util.HashMap;

public class Menu {

    private static HashMap<Integer, Object> menuItems = new HashMap<>();

    public void addMenuItem(MenuItem menuItem) {
        menuItems.put((menuItems.size() + 1), menuItem);
        System.out.println(menuItem.getItemName() + " was added into menu on position: " + menuItems.size());
    }

    public double getPriceOfMenuItem(String itemName) {
        Object menuItem = null;
        boolean navigator = false;
        for (int i = 1; i <= menuItems.size(); i++) {
            menuItem = menuItems.get(i);
            if (itemName == ((MenuItem) menuItem).getItemName()) {
                navigator = true;
                break;
            }
        }
        if (navigator) {
            return ((MenuItem) menuItem).getItemPrice();
        } else {
            return 0;
        }
    }

    public void printMenu() {
        System.out.println("*** Restaurant Menu ***");
        for (int i = 1; i <= menuItems.size(); i++) {
            Object menuItem = menuItems.get(i);
            System.out.println(i + ". " + ((MenuItem) menuItem).getItemName() + "\"" + ((MenuItem) menuItem).getItemDescription()
                    + ". \" with price: " + ((MenuItem) menuItem).getItemPrice() + " PLN");
        }
        System.out.println("*** End of restaurant menu ***");
    }

}



