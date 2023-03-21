package com.lyz.code.pat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] group = new double[n][3];
        int d = sc.nextInt();
        for (int i = 0; i < n; i++) {
            group[i][0] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            group[i][1] = sc.nextDouble();
            group[i][2] = group[i][1] / group[i][0];
        }
        Arrays.sort(group, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                if ((o2[2] - o1[2]) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (group[i][0] <= d) {
                sum += group[i][1];
            } else {
                sum += d * group[i][2];
            }
            d -= group[i][0];
            if (d <= 0) {
                break;
            }
        }
        System.out.printf("%.2f", sum);
    }
}
