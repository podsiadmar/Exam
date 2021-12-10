package com.intive.exam;

public class Building {
    protected int roomsNumber;
    protected int bathroomNumber;
    protected boolean kitchen;

    public Building(final int roomsNumber, final int bathroomNumber, final boolean kitchen) {
        this.roomsNumber = roomsNumber;
        this.bathroomNumber = bathroomNumber;
        this.kitchen = kitchen;
    }

    public void printBuildingStatus() {
        System.out.println("Building has " + roomsNumber + " room(s) " + (kitchen ? "and kitchen. " : "and no kitchen. ") + "Also with "
                + bathroomNumber + " bathroom(s).");
    }
}
