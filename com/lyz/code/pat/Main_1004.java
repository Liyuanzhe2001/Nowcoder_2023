package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String week = "";
        int hour = 0;
        int min = 0;
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int len1 = Math.min(str1.length(), str2.length());
        char c1, c2;

        boolean flag = true;

        for (int i = 0; i < len1; i++) {
            c1 = str1.charAt(i);
            c2 = str2.charAt(i);
            if (c1 == c2) {
                if (flag) {
                    if ('A' <= c1 && c1 <= 'G') {
                        switch (c1) {
                            case 'A':
                                week = "MON";
                                break;
                            case 'B':
                                week = "TUE";
                                break;
                            case 'C':
                                week = "WED";
                                break;
                            case 'D':
                                week = "THU";
                                break;
                            case 'E':
                                week = "FRI";
                                break;
                            case 'F':
                                week = "SAT";
                                break;
                            case 'G':
                                week = "SUN";
                                break;
                        }
                        flag = false;
                    }
                } else {
                    if ('0' <= c1 && c1 <= '9') {
                        hour = c1 - '0';
                        break;
                    } else if ('A' <= c1 && c1 <= 'N') {
                        hour = c1 - 'A' + 10;
                        break;
                    }
                }
            }
        }

        String str3 = sc.nextLine();
        String str4 = sc.nextLine();
        int len2 = Math.min(str3.length(), str4.length());
        for (int i = 0; i < len2; i++) {
            c1 = str3.charAt(i);
            c2 = str4.charAt(i);
            if (c1 == c2) {
                if (('a' <= c1 && c1 <= 'z') || ('A' <= c1 && c1 <= 'Z')) {
                    min = i;
                    break;
                }
            }
        }

        System.out.println(week + " " + (hour < 10 ? "0" + hour : hour) + ":" + (min < 10 ? "0" + min : min));
    }
}
