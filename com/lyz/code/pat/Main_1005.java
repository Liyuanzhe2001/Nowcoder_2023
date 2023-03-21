package com.lyz.code.pat;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int h = sc.nextInt();

        int[][] groupOne = new int[n][3];
        int indexOne = 0;
        int[][] groupTwo = new int[n][3];
        int indexTwo = 0;
        int[][] groupThree = new int[n][3];
        int indexThree = 0;
        int[][] groupFour = new int[n][3];
        int indexFour = 0;

        int no, scoreOne, scoreTwo, cnt = 0;
        for (int i = 0; i < n; i++) {
            no = sc.nextInt();
            scoreOne = sc.nextInt();
            scoreTwo = sc.nextInt();
            if (scoreOne < l || scoreTwo < l) {
                continue;
            }
            cnt++;
            if (scoreOne >= h && scoreTwo >= h) {
                groupOne[indexOne][0] = no;
                groupOne[indexOne][1] = scoreOne;
                groupOne[indexOne++][2] = scoreTwo;
            } else if (scoreOne >= h) {
                groupTwo[indexTwo][0] = no;
                groupTwo[indexTwo][1] = scoreOne;
                groupTwo[indexTwo++][2] = scoreTwo;
            } else if (scoreTwo <= h && scoreOne >= scoreTwo) {
                groupThree[indexThree][0] = no;
                groupThree[indexThree][1] = scoreOne;
                groupThree[indexThree++][2] = scoreTwo;
            } else {
                groupFour[indexFour][0] = no;
                groupFour[indexFour][1] = scoreOne;
                groupFour[indexFour++][2] = scoreTwo;
            }
        }

        Arrays.sort(groupOne, (o1, o2) -> {
            if (o2[1] + o2[2] - o1[1] - o1[2] != 0) {
                return o2[1] + o2[2] - o1[1] - o1[2];
            } else if (o2[1] != o1[1]) {
                return o2[1] - o1[1];
            } else {
                return o1[0] - o2[0];
            }
        });
        Arrays.sort(groupTwo, (o1, o2) -> {
            if (o2[1] + o2[2] - o1[1] - o1[2] != 0) {
                return o2[1] + o2[2] - o1[1] - o1[2];
            } else if (o2[1] != o1[1]) {
                return o2[1] - o1[1];
            } else {
                return o1[0] - o2[0];
            }
        });
        Arrays.sort(groupThree, (o1, o2) -> {
            if (o2[1] + o2[2] - o1[1] - o1[2] != 0) {
                return o2[1] + o2[2] - o1[1] - o1[2];
            } else if (o2[1] != o1[1]) {
                return o2[1] - o1[1];
            } else {
                return o1[0] - o2[0];
            }
        });
        Arrays.sort(groupFour, (o1, o2) -> {
            if (o2[1] + o2[2] - o1[1] - o1[2] != 0) {
                return o2[1] + o2[2] - o1[1] - o1[2];
            } else if (o2[1] != o1[1]) {
                return o2[1] - o1[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        indexOne = 0;
        indexTwo = 0;
        indexThree = 0;
        indexFour = 0;

        System.out.println(cnt);

        while (groupOne[indexOne][0] != 0) {
            System.out.print(groupOne[indexOne][0] + " ");
            System.out.print(groupOne[indexOne][1] + " ");
            System.out.println(groupOne[indexOne][2] + " ");
            indexOne++;
        }
        while (groupTwo[indexTwo][0] != 0) {
            System.out.print(groupTwo[indexTwo][0] + " ");
            System.out.print(groupTwo[indexTwo][1] + " ");
            System.out.println(groupTwo[indexTwo][2] + " ");
            indexTwo++;
        }
        while (groupThree[indexThree][0] != 0) {
            System.out.print(groupThree[indexThree][0] + " ");
            System.out.print(groupThree[indexThree][1] + " ");
            System.out.println(groupThree[indexThree][2] + " ");
            indexThree++;
        }
        while (groupFour[indexFour][0] != 0) {
            System.out.print(groupFour[indexFour][0] + " ");
            System.out.print(groupFour[indexFour][1] + " ");
            System.out.println(groupFour[indexFour][2] + " ");
            indexFour++;
        }
    }

}
