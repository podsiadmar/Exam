package com.intive.exam;

import java.util.TreeSet;

public class Restaurant extends Building {
    TreeSet<Employee> employeeList = new TreeSet<>();
    Menu menu = new Menu();

    public Restaurant(int roomsNumber, int bathroomNumber, boolean kitchen) {
        super(roomsNumber, bathroomNumber, kitchen);
    }

    public void addToEmployeeList(Employee employee) {
        employeeList.add(employee);
        System.out.println(employee.getFullName() + " has been added to Employees list.");

    }

    public Employee getEmployeeObjectByName(String name) {
        Employee emp = null;
        boolean isOnTheList = false;
        for (Employee employee : employeeList) {
            if (employee.getFullName().contains(name)) {
                emp = employee;
                isOnTheList = true;
            }
        }
        if (isOnTheList) {
            return emp;
        } else {
            return null;
        }
    }

    public void printEmployeeList() {
        System.out.println("*** Employee List ***");
        for (Employee employee : employeeList) {
            System.out.println(employee.getFullName() + " is working as a " + employee.getPosition() +
                    " with salary per hour: " + employee.getSalaryPerHour() + " PLN");
        }
        System.out.println("*** End of employees list ***");
    }

    public Menu getMenu() {
        return menu;
    }

    public void addMenu(Menu menu) {
        this.menu = menu;
    }

    public void printMenu() {
        menu.printMenu();
    }


}
