package com.lyz.code.pat;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main_1014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char ff = str.charAt(0);
        String num = str.substring(1, str.indexOf('E'));
        String zs = num.substring(0, num.indexOf('.'));
        String xs = num.substring(num.indexOf('.') + 1);

        char lf = str.charAt(str.indexOf('E') + 1);
        int b = Integer.parseInt(str.substring(str.indexOf('E') + 2));

        if (ff == '-') {
            System.out.print("-");
        }

        if (lf == '+') {
            if (xs.length() >= b) {
                System.out.println(zs + xs.substring(0, b) + "." + xs.substring(b));
            } else {
                System.out.print(zs + xs + "");
                for (int i = xs.length(); i < b; i++) {
                    System.out.print("0");
                }
            }
        } else {
            if (zs.length() >= b) {
                System.out.println(zs.substring(0, zs.length() - b + 1) + "." + zs.substring(zs.length() - b) + xs.substring(b));
            } else {
                System.out.print("0.");
                for (int i = 0; i < b - zs.length(); i++) {
                    System.out.print("0");
                }
                System.out.println(zs + xs);
            }
        }


    }

}
