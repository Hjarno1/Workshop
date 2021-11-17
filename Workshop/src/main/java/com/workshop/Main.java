package com.workshop;

public class Main {
    public static void main(String[] args) {
        BuildingManagementSystem b = new BuildingManagementSystem();

        var palads = b.addBuilding("Palads");
        System.out.println(b.getBuildings());


        System.out.println(b.getBuildings());
    }
}
