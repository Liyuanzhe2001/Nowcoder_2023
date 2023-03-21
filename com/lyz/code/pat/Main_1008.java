package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1008 {

    public static void main(String[] args) {
        int[] a = new int['Z' + 1];
        int[] b = new int['Z' + 1];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0, p = 0, f = 0;
        for (int i = 0; i < n; i++) {
            String c1 = sc.next();
            String c2 = sc.next();
            if ("C".equals(c1)) {
                if ("C".equals(c2)) {
                    p++;
                } else if ("J".equals(c2)) {
                    a['C']++;
                    s++;
                } else {
                    b['B']++;
                    f++;
                }
            } else if ("J".equals(c1)) {
                if ("C".equals(c2)) {
                    f++;
                    b['C']++;
                } else if ("J".equals(c2)) {
                    p++;
                } else {
                    s++;
                    a['J']++;
                }
            } else {
                if ("C".equals(c2)) {
                    s++;
                    a['B']++;
                } else if ("J".equals(c2)) {
                    f++;
                    b['J']++;
                } else {
                    p++;
                }
            }
        }

        System.out.println(s + " " + p + " " + f);
        System.out.println(f + " " + p + " " + s);

        int tmp = a['B'];
        String tmpS = "B";
        if (tmp < a['C']) {
            tmp = a['C'];
            tmpS = "C";
        }
        if (tmp < a['J']) {
            tmp = a['J'];
            tmpS = "J";
        }
        System.out.print(tmpS + " ");

        tmp = b['B'];
        tmpS = "B";
        if (tmp < b['C']) {
            tmp = b['C'];
            tmpS = "C";
        }
        if (tmp < b['J']) {
            tmp = b['J'];
            tmpS = "J";
        }
        System.out.print(tmpS + " ");
    }
}
