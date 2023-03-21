package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String da = sc.next();
        String numA = "";
        String b = sc.next();
        String db = sc.next();
        String numB = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if ((c + "").equals(da)) {
                numA += da;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if ((c + "").equals(db)) {
                numB += db;
            }
        }
        numA = numA.equals("") ? "0" : numA;
        numB = numB.equals("") ? "0" : numB;
        System.out.println(Integer.parseInt(numA) + Integer.parseInt(numB));
    }

}
