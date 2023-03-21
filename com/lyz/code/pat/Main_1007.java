package com.lyz.code.pat;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_1007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String b = sc.next();
        BigInteger num1 = new BigInteger(num);
        BigInteger num2 = new BigInteger(b);
        System.out.print(num1.divide(num2) + " " + num1.mod(num2));
    }

}
