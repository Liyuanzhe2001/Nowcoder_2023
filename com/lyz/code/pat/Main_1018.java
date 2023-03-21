package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String maxName = "";
        int maxAgeYear = Integer.MAX_VALUE;
        int maxAgeMonth = Integer.MAX_VALUE;
        int maxAgeDay = Integer.MAX_VALUE;
        String minName = "";
        int minAgeYear = Integer.MIN_VALUE;
        int minAgeMonth = Integer.MIN_VALUE;
        int minAgeDay = Integer.MIN_VALUE;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String time = sc.next();
            String[] split = time.split("/");
            int year = Integer.parseInt(split[0]);
            int month = Integer.parseInt(split[1]);
            int day = Integer.parseInt(split[2]);
            boolean flag = false;
            if (year <= 2014 && year >= 1814) {
                if (year == 2014) {
                    if (month < 9) {
                        flag = true;
                    } else if (month == 9) {
                        if (day <= 6) {
                            flag = true;
                        }
                    }
                } else if (year == 1814) {
                    if (month > 9) {
                        flag = true;
                    } else if (month == 9) {
                        if (day >= 6) {
                            flag = true;
                        }
                    }
                } else {
                    flag = true;
                }
            }
            if (flag) {
                cnt++;
                if (!judgeOlder(maxAgeYear, maxAgeMonth, maxAgeDay, year, month, day)) {
                    maxAgeYear = year;
                    maxAgeMonth = month;
                    maxAgeDay = day;
                    maxName = name;
                }
                if (judgeOlder(minAgeYear, minAgeMonth, minAgeDay, year, month, day)) {
                    minAgeYear = year;
                    minAgeMonth = month;
                    minAgeDay = day;
                    minName = name;
                }
            }
        }
        System.out.println(cnt + " " + maxName + " " + minName);
    }

    public static boolean judgeOlder(int year1, int month1, int day1, int year2, int month2, int day2) {
        if (year1 < year2) {
            return true;
        } else if (year1 > year2) {
            return false;
        } else {
            if (month1 < month2) {
                return true;
            } else if (month1 > month2) {
                return false;
            } else {
                return day1 < day2;
            }
        }
    }
}
