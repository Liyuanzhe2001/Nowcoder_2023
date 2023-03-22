package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean[] flag = new boolean[10001];
        for (char c : str1.toCharArray()) {
            flag[c] = true;
        }
        for (char c : str2.toCharArray()) {
            char tmp = String.valueOf(c).toUpperCase().charAt(0);
            if ('A' <= c && c <= 'Z') {
                if (!(flag[','] || flag['.'] || flag['+'])) {
                    if (!flag[c]) {
                        System.out.print(c);
                    }
                }
            } else {
                if (!flag[tmp]) {
                    System.out.print(c);
                }
            }
        }
    }
}
