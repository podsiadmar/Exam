package com.intive.exam;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Restaurant extends Building {
    Menu menu = new Menu();
    TreeSet<Employee> employeeList = new TreeSet<>();

    public void addToEmployeeList(String name, String surname, String position, int salary) {
        Employee emp = new Employee(name, surname, position, salary);
        employeeList.add(emp);
        System.out.println(emp.getFullName() + " has been added to Employees list.");

    }

    public void getEmployeeData(String fullName, String data) {
        List<Object> filtered = employeeList.stream().filter(employee -> employee.getFullName().contains(fullName)).collect(Collectors.toList());

        if (filtered.size() == 0) {
            System.out.println("There is no such employee on the list");
        } else {
            Object obj = filtered.get(0);

            switch (data) {
                case "Position":
                    System.out.println(fullName + " position is a " + ((Employee) obj).position);
                case "Salary":
                    System.out.println(fullName + " salary is " + String.valueOf(((Employee) obj).salaryPerHour) + " PLN");

            }

        }

    }


    public Restaurant(int roomsNumber, int bathroomNumber, boolean kitchen) {
        super(roomsNumber, bathroomNumber, kitchen);
    }

    public void printBuldingStatus() {
        printBuildingStatus();
    }

    public void addToMenu(String itemName, String itemDescription, double itemPrice) {
        MenuItem newDish = new MenuItem(itemName, itemDescription, itemPrice);
        menu.addDishToMenu(newDish.getItemName() + newDish.getItemDescription(), newDish.getItemPrice());

    }

    public void getMenu(){
        menu.getMenuItems();
    }

    public void printMenu() {
        System.out.println("*** Restaurant Menu ***");
        Set<String> keyset = menu.menuItems.keySet();
        for (int i = 1; i <= 3; i++) {
            int finalI = i;
            List<String> filtered = keyset.stream().filter(c -> c.contains(String.valueOf(finalI))).collect(Collectors.toList());
            System.out.println(filtered.get(0) + "with price: " + menu.getDishPrice(filtered.get(0)) + " PLN");
        }
        System.out.println("*** End of restaurant menu ***");
    }

    public void printEmployeeList(){
        System.out.println("*** Restaurant Menu ***");
        for (Object empoleyee: employeeList) {
            System.out.println(((Employee) empoleyee).fullName+ " is working as a " + ((Employee) empoleyee).position +
                    " with salary per hour: "+ ((Employee) empoleyee).salaryPerHour + " PLN");
        }


        System.out.println("*** End of restaurant menu ***");
    }


}
