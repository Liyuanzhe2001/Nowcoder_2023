package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l1 = sc.nextLong();
        long l2 = sc.nextLong();
        long l = l2 - l1;

        String h = String.valueOf(l / 100 / 3600);
        h = h.length() == 1 ? ("0" + h) : h;
        String m = String.valueOf(l / 100 / 60 % 60);
        m = m.length() == 1 ? ("0" + m) : m;
        String s = String.valueOf(l / 100 % 60);
        s = s.length() == 1 ? ("0" + s) : s;
        System.out.println(h + ":" + m + ":" + s);

    }

}
