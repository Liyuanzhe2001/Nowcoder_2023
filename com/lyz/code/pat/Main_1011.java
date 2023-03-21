package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int[] nums = new int[10];
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            nums[c - '0']++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                System.out.println(i + ":" + nums[i]);
            }
        }
    }

}
