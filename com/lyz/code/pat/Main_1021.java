package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1021 {

    public static void main(String[] args) {
        int[] h = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] m = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int sum = 0;
            for (int j = 0; j < 17; j++) {
                char c = str.charAt(j);
                if ('0' <= c && c <= '9') {
                    sum += h[j] * (c - '0');
                }
            }
            if (m[sum % 11] != str.charAt(str.length() - 1)) {
                flag = false;
                System.out.println(str);
            }
        }
        if (flag) {
            System.out.println("All passed");
        }
    }

}
