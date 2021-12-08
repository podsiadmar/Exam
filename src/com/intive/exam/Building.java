package com.intive.exam;

public class Building {
    protected int roomsNumber;
    protected int bathroomNumber;
    protected boolean kitchen;

    public Building(int roomsNumber, int bathroomNumber, boolean kitchen) {
        this.roomsNumber = roomsNumber;
        this.bathroomNumber = bathroomNumber;
        this.kitchen = kitchen;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public int getBathroomNumber() {
        return bathroomNumber;
    }

    public void setBathroomNumber(int bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }

    public void printBuildingStatus() {
        System.out.println("*** Building Status ***");
        if (kitchen)
            System.out.println("Building has " + getRoomsNumber() + " room(s) " + "and kitchen. Also with "
                    + getBathroomNumber() + " bathroom(s).");
        else {
            System.out.println("Building has " + getRoomsNumber() + " room(s) " + "and no kitchen. Also with "
                    + getBathroomNumber() + " bathroom(s).");
        }
        System.out.println("*** End of building status ***");
    }
}
