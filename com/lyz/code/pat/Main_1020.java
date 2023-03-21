package com.lyz.code.pat;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int len = 1;
        for (int i = 0; i < nums.length; i++) {
            int tmp = i + len;
            for (int j = tmp; j < nums.length; j++) {
                if (nums[i] * p >= nums[j]) {
                    len++;
                } else {
                    break;
                }
            }
        }
        System.out.println(len);
    }
}
