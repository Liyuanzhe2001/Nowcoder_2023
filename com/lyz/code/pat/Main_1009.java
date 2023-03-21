package com.lyz.code.pat;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if(num.equals("6174")){
            System.out.println("7641 - 1467 = 6174");
            return;
        }

        while (!num.equals("6174")) {
            for (int i = num.length(); i < 4; i++) {
                num = "0" + num;
            }
            char[] chars = num.toCharArray();
            Arrays.sort(chars);
            int lef = 0;
            int rig = chars.length - 1;
            int res = 0;
            int s = (int) Math.pow(10, chars.length - 1);
            String num1 = "", num2 = "";
            for (int i = 0; i < chars.length; i++) {
                res += (chars[rig] - chars[lef]) * s;
                num1 += chars[rig--];
                num2 += chars[lef++];
                s /= 10;
            }
            System.out.println(num1 + " - " + num2 + " = " + res);
            num = res + "";
        }
    }
}
