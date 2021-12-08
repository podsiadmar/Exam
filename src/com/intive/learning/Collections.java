package com.intive.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {
    public static void main(String[] args){

//        List<String> col = new ArrayList<>();
//        col.add("First");
//        col.add("Second");
//        col.add("1");
//
//        System.out.println("***************");

        Map<String, String> mapV = new HashMap<>();
        mapV.put("qwe", "First");
        mapV.put("asf", "Second");
        mapV.put("zxc", "Third");



        List<String> names = new ArrayList<>();
        names.add("Janek");
        names.add("Ewa");
        names.add("Pawel");
        names.add("Magda");
        names.add("Karolina");

        for (String element : names) {
            System.out.println(element);

        }

        House house = new House();
        house.setWindow(2);
        System.out.println(house.getWindow());

        Car car = new Car();
        car.setSunRoof();
        car.setColor("red");


    }
}
