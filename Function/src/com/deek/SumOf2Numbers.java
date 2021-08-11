package com.deek;

import java.util.Scanner;

public class SumOf2Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int first_num = in.nextInt();
        int second_num = in.nextInt();

        int result = sum(first_num, second_num);
        System.out.println(result);

    }

    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
