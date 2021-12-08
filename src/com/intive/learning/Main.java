package com.intive.learning;

public class Main {

    public static void main(String[] args) {
        // CTRL+ALT+L - formatowanie
        // CTRL+W - zaznaczanie
        // Overflow - Underflow
        // CTRL + D - duplikacja kodu
        // Typy referencyjne przechowuja adres do obiektu

//        System.out.println("Hello World");
//        System.out.println("Hello world1");
//
        // Typy prymitywne
//        byte byteVar = Byte.MAX_VALUE;
//
//        System.out.print(Byte.MIN_VALUE);
//        System.out.print(" : ");
//        System.out.println(byteVar);
//
//        System.out.println(Byte.MIN_VALUE +" : "+ Byte.MAX_VALUE);
//
//        System.out.println(Long.MIN_VALUE +" : "+Long.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE+" : "+Double.MAX_VALUE);
//
//        int notBasketNotABox = 3;
//        System.out.println("notBasketNotABox has " + notBasketNotABox + " apples");
//
//        int anotherNotBasketButABox;
//        anotherNotBasketButABox = notBasketNotABox;
//        System.out.println("anotherNotBasketNotABox has " + anotherNotBasketButABox + " apples");
//
//        notBasketNotABox = 4;
//        System.out.println("notBasketNotABox has " + notBasketNotABox + " apples");
//        System.out.println("anotherNotBasketNotABox has " + anotherNotBasketButABox + " apples");

        //Typy referencyjne
        HouseWithGarage domek = new HouseWithGarage();
        domek.setCars(2);
        System.out.println(domek.getCars());

        HouseWithGarage domeczek = domek;
        domeczek.setCars(1);
        System.out.println(domeczek.getCars());

        //Stringi
        String test1 = "Apple";
        System.out.println(test1);
        String test2 = test1;
        System.out.println(test2);
        test1 = "Peach";
        System.out.println(test1);

        String a = new String("abcd");
        String b = new String("abcd");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String name = "Marcin";
        System.out.println("My name is :" + name);
    }
}
