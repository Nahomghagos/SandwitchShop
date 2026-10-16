package com.pluralsight;

import java.util.Scanner;

public class SandwitchShop {
    public static void main(String[] args) {

        double size1;
        size1=5.45;

        double size2;
        size2=8.95;

        String No;
        No=("there will be nothing added ");





        Scanner myScanner = new Scanner(System.in);
        System.out.println("what size sandwitch? ");

        int sandwitch = myScanner.nextInt();
        System.out.println("how old are you? ");
        int age= myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("would you like to have it loaded? type Yes or No");
        String loaded= myScanner.nextLine();
        if  (sandwitch ==1 && age<=17) {
            System.out.println("you have a 10% discount "+ size1*0.9 + (loaded.equals("yes") ? 1.00 : No));
        } else if (sandwitch==1 && age>=65) {
            System.out.println("you have a 20% discount "+ size1*0.8 + (loaded.equals("yes") ? 1.00 : No));
        } else if (sandwitch==2 && age<=17) {
            System.out.println("you have a 10% discount "+ size2*0.9 + (loaded.equals("yes") ? 1.75 : No));
        } else if (sandwitch==2 && age>=65) {
            System.out.println("you have a 20% discount "+ size2*0.8 + (loaded.equals("yes") ? 1.75 : No));
        } else if (sandwitch==1) {
            System.out.println("your total comes to "+ size1 + (loaded.equals("yes") ? 1.00 : No));
        }else if (sandwitch==2) {
            System.out.println("your total comes to "+ size2 + (loaded.equals("yes") ? 1.75 : No));
        }


    }
}
