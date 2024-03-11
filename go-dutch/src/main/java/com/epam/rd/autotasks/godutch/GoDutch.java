package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {

        int[] values = new int[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
            if (i == 0 && values[i]<0){
                System.out.println("Bill total amount cannot be negative");
                break;
            } else if (i!=0  && values[i]<= 0) {
                System.out.println("Number of friends cannot be negative or zero");
                break;
            }
        }
        int bill = values[0];
        int numberOfFriends = values[1];
        if (bill >=0 && numberOfFriends >0 ) {
            bill = bill + bill / 10;
            int finalPrice = bill / numberOfFriends;
            System.out.println(finalPrice);
        }
    }
    }

