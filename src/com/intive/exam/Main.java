package com.intive.exam;

public class Main {


    public static void main(String[] args) {
        //initialize objects
        Restaurant restaurant = new Restaurant(6, 3, true);
        Menu menu = new Menu();

        Employee Karol = new Employee("Karol", "Okrasa", "Waiter", 25);
        Employee Magda = new Employee("Magda", "Gessler", "Manager", 333);
        Employee Michel = new Employee("Michel", "Moran", "Cashier", 45);
        Employee Robert = new Employee("Robert", "Makłowicz", "Cook", 666);

        MenuItem Fries = new MenuItem("Fries", "Chopped and fried potatoes", 12.0);
        MenuItem Cola = new MenuItem("Cola", "Nasty sparkly drink", 7.99);
        MenuItem Nuggets = new MenuItem("Nuggets", "Ground chcken", 25.0);
        MenuItem Pierogi = new MenuItem("Pierogi", "Dimplings", 12.99);

        //slide 39
        restaurant.addToEmployeeList(Karol);
        restaurant.addToEmployeeList(Magda);
        restaurant.addToEmployeeList(Michel);
        restaurant.addToEmployeeList(Robert);
        System.out.println("");
        restaurant.getEmployeeObjectByName("Magda").updateEmployeePosition("Waiter");
        System.out.println(restaurant.getEmployeeObjectByName("Magda").getPosition());
        restaurant.getEmployeeObjectByName("Karol").updateEmployeeSalaryPerHour(48);
        System.out.println(restaurant.getEmployeeObjectByName("Karol").getSalaryPerHour());


        //slide 40
        System.out.println(menu.getPriceOfMenuItem("Fries"));
        menu.addMenuItem(Fries);
        menu.addMenuItem(Cola);
        menu.addMenuItem(Nuggets);
        System.out.println("");
        System.out.println(menu.getPriceOfMenuItem("Fries"));
        System.out.println(menu.getPriceOfMenuItem("Nuggets"));
        System.out.println(menu.getPriceOfMenuItem("Cola"));
        System.out.println(menu.getPriceOfMenuItem("Mango"));
        System.out.println("");
        menu.printMenu();

        //slide 41
        System.out.println(restaurant.getEmployeeObjectByName("Michel").getFullName());
        System.out.println(restaurant.getEmployeeObjectByName("Robert").getSalaryPerHour());
        System.out.println(restaurant.getEmployeeObjectByName("Magda").getPosition());
        System.out.println("");
        restaurant.printEmployeeList();
        restaurant.printBuildingStatus();
        System.out.println("");
        restaurant.addMenu(menu);
        restaurant.getMenu().addMenuItem(Pierogi);
        System.out.println("");
        restaurant.printMenu();
        System.out.println("");
        System.out.println(restaurant.getMenu().getPriceOfMenuItem("Nuggets"));



    }
}
