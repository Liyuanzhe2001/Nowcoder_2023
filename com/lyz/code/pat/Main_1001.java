package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            System.out.println("Case #"+(i + 1)+": " +( a + b > c));
        }
    }

}
