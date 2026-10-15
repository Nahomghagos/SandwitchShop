package com.pluralsight;

import java.util.Scanner;

public class SandwitchShop {
    public static void main(String[] args) {

        double size1;
        size1=5.45;

        double size2;
        size2=8.95;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("what size sandwitch? ");

        int sandwitch = myScanner.nextInt();
        if ( sandwitch ==(1)) {
            System.out.println("your total is "+ size1);
        } else if (sandwitch ==(2)) {
            System.out.println("your total is "+ size2);
        } else {
            System.out.println("i guess no sandwitch for you ");

        }


    }
}
