package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int tmp = 2;
        int use = 1;
        while (true) {
            use += 2 * (2 * tmp - 1);
            if (use > n) {
                use -= 2 * (2 * tmp - 1);
                tmp--;
                break;
            }
            tmp++;
        }
        for (int i = tmp; i > 0; i--) {
            for (int j = 0; j < tmp - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
        for (int i = 2; i <= tmp; i++) {
            for (int j = 0; j < tmp - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(s);
            }
            System.out.println();
        }


        System.out.println(n - use);
    }

}
