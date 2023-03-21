package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int min = Integer.MAX_VALUE;

        String res = "";

        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            for (int j = 0; j < nums[i]; j++) {
                res += i;
            }
            if (flag && i != 0 && nums[i] != 0) {
                min = i;
                flag = false;
            }
        }

        res = res.substring(0, res.indexOf(min + "")) + res.substring(res.indexOf(min + "") + 1);
        res = min + res;
        System.out.print(res);

    }

}
