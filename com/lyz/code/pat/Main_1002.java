package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        double a4 = 0;
        int s = 0;
        int a5 = 0;
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp % 10 == 0) {
                a1 += tmp;
            }
            if (tmp % 5 == 1) {
                a2 += flag ? tmp : -tmp;
                flag = !flag;
            }
            if (tmp % 5 == 2) {
                a3++;
            }
            if (tmp % 5 == 3) {
                a4 += tmp;
                s++;
            }
            if (tmp % 5 == 4) {
                a5 = Math.max(tmp, a5);
            }
        }
        System.out.print((a1 == 0 ? "N" : a1) + " ");
        System.out.print((a2 == 0 ? "N" : a2) + " ");
        System.out.print((a3 == 0 ? "N" : a3) + " ");
        if (s == 0) {
            System.out.print("N ");
        } else {
            System.out.printf("%.1f ", a4 / s);
        }
        System.out.print((a5 == 0 ? "N" : a5));

    }

}
