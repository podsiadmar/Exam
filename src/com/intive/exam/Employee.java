package com.intive.exam;

public class Employee implements Comparable<Employee>{
    protected String name;
    protected String surname;
    protected String position;
    protected int salaryPerHour;
    protected String fullName;

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }

    public Employee(String name, String surname, String position, int salaryPerHour) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salaryPerHour = salaryPerHour;
        this.fullName = getFullName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        this.fullName = name + " " + surname;
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public void printEmployeeData() {
        System.out.println(getFullName() + " is working as " + getPosition() + " with salary per hour: " + getSalaryPerHour() + " PLN");
    }





}
