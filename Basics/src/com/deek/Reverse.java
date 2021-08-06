package com.deek;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rev=0,num = in.nextInt();

        if(num < 0){
            System.out.println("Please enter a positive number");
        }
        while(num>0){
            int rem = num%10;
            num /= 10;
            rev = rev*10 +rem;
        }

        System.out.println("The reversed number is " + rev);

    }
}
