package com.intive.exam;

public class Employee implements Comparable<Employee> {
    private String position;
    private int salaryPerHour;
    private String fullName;

    @Override
    public int compareTo(Employee o) {
        return fullName.compareTo(o.fullName);
    }

    public Employee(final String name, final String surname, String position, int salaryPerHour) {
        this.fullName = name + " " + surname;
        this.position = position;
        this.salaryPerHour = salaryPerHour;

    }

    public String getPosition() {
        return position;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public String getFullName() {
        return fullName;
    }

    public void updateEmployeePosition(String position) {
        this.position = position;
    }

    public void updateEmployeeSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public void printEmployeeData() {
        System.out.println(fullName + " is working as " + getPosition() +
                " with salary per hour: " + getSalaryPerHour() + " PLN");
    }


}
