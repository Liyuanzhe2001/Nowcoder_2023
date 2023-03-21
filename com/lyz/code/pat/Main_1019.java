package com.lyz.code.pat;

import java.util.HashSet;
import java.util.Scanner;

public class Main_1019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] char1 = sc.next().toCharArray();
        char[] char2 = sc.next().toCharArray();
        boolean[] flag = new boolean[10001];

        int index = 0;
        for (char c : char1) {
            if (index > char2.length - 1 || c != char2[index]) {
                c = String.valueOf(c).toUpperCase().charAt(0);
                if(!flag[c]){
                    System.out.print(c);
                    flag[c] = true;
                }
            } else {
                index++;
            }
        }
    }
}
