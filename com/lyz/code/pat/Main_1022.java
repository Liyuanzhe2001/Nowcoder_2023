package com.lyz.code.pat;

import java.util.HashMap;
import java.util.Scanner;

public class Main_1022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int max = 0;
        int maxNo = 0;
        for (int i = 0; i < n; i++) {
            int no = sc.nextInt();
            int score = sc.nextInt();
            map.put(no, map.getOrDefault(no, 0) + score);
            if (map.get(no) > max) {
                max = map.get(no);
                maxNo = no;
            }
        }
        System.out.println(maxNo + " " + max);

    }
}
