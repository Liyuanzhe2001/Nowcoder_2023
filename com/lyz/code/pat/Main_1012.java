package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long sum = a + b;
        int d = sc.nextInt();
        System.out.println(Long.toString(sum, d));
    }
}
