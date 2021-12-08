package com.intive;

public class Printing {
    public static void main(String[] args){


        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.print("*");
            }
            System.out.println();

        }



        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.print("*");
                if(k==i){
                    break;
                }
            }
            System.out.println();

        }

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if(i==0 || i==9){
                    System.out.print("*");
                }
                else if(k==0 || k==9) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        int maxLoops = 11;
        int center = (maxLoops-1)/2;
        int j=0;
        for (int i = 0; i < center+2; i++) {
            for (int k = 0; k < maxLoops+2; k++) {
                if (k>=(center+j) || k<=(center-j)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();
            j = j + 1;
        }
    }
}
