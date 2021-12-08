package com.intive.learning;

import java.util.ArrayList;
import java.util.List;

public class Conditions {
    public static void main(String[] args) {
        byte var = 3;
        if (1 + 1 == var) {
            System.out.println("DAC RAJT");
        } else if (1 + 2 == var) {
            System.out.println("DAC QL");
        } else
            System.out.println("DAC NOT RAJT");

        //skrocony if
        int newVar = (1 + 1 == var) ? 1 : 0;

        int wiek = 32;

        if (wiek >= 11 && wiek <= 18) {
            System.out.println("Jesteś nastolatkiem");
        } else if (wiek < 11) {
            System.out.println("Jesteś dzieckiem");
        } else {
            System.out.println("Nie jesteś już nastolatkiem");
        }

        String p1 = "C";
        String p2 = "L";
        String p3 = "K";

        List<String> queue = new ArrayList<>();
        queue.add(p1);
        queue.add(p2);
        queue.add(p3);

        for (int iterator = 0; iterator < queue.size(); iterator++) {
            System.out.println(queue.get(iterator));
        }

        for (String name : queue) {
            System.out.println(name);
        }

//        for (int i=0; i<10; i++){
//            System.out.print("*");
//        }


        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.print("*");
            }
            System.out.println();

        }


//
//        for (int i=0; i<10; i++){
//            if(i==0 || i==9){
//                System.out.println("**********");
//            }
//            else {
//                System.out.println("*        *");
//            }
//        }


    }


}
