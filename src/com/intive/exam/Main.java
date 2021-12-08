package com.intive.exam;

public class Main {


    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant(6, 3, false);
        restaurant.printBuldingStatus();
        System.out.println("");
        restaurant.addToMenu("Fries", "\"Chopped and friend potatoes\" ", 12.5);
        restaurant.addToMenu("Cola", "\"Nasty sparkly drink.\" ", 7.99);
        restaurant.addToMenu("Nuggets", "\"Ground chicken.\" ", 25.0);
        System.out.println("");
        restaurant.printMenu();
        System.out.println("");
        restaurant.addToEmployeeList("Karol", "Okrasa", "Waiter", 25);
        restaurant.addToEmployeeList("Magda", "Gessler", "Manager", 333);
        restaurant.addToEmployeeList("Michel", "Moran", "Cashier", 45);
        restaurant.addToEmployeeList("Robert", "Makłowicz", "Cook", 666);
        System.out.println("");
        restaurant.getEmployeeData("Michel Moran", "Salary");
        restaurant.getEmployeeData("Robert Makłowicz", "Position");
        restaurant.getEmployeeData("Modest Amaro", "Position");
        System.out.println("");
        restaurant.printEmployeeList();






    }
}
