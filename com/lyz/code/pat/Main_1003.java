package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int current = 2;
        int n = 0;
        while (n < b) {
            boolean flag = true;
            for (int j = 2; j < current; j++) {
                if (current % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                n++;
                if (n >= a) {
                    System.out.print(current + " ");
                    if ((n - a + 1) % 10 == 0) {
                        System.out.println();
                    }
                }
            }
            current++;
        }
    }

}
