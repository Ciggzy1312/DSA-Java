package com.deek;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.next();
         String res = greeting(name);

        System.out.println(res);
    }

    static String greeting(String name){

        String result = "Hello " + name;
        return result;
    }
}
