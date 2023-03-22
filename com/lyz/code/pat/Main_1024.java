package com.lyz.code.pat;

import java.util.Scanner;

public class Main_1024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strOne = sc.next();
        String strTwo = sc.next();

        String[] splitOne = strOne.split("/");
        String[] splitTwo = strTwo.split("/");

        int[] numOne = {Integer.parseInt(splitOne[0]), Integer.parseInt(splitOne[1])};
        int[] numTwo = {Integer.parseInt(splitTwo[0]), Integer.parseInt(splitTwo[1])};

        String noOne = change(numOne);
        String noTwo = change(numTwo);

        int[] add = add(numOne, numTwo);
        System.out.println(noOne + " + " + noTwo + " = " + change(add));

        int[] subtract = subtract(numOne, numTwo);
        System.out.println(noOne + " - " + noTwo + " = " + change(subtract));

        if (numOne[0] == 0 || numTwo[0] == 0) {
            System.out.println(noOne + " * " + noTwo + " = " + 0);
        } else {
            int[] multiply = multiply(numOne, numTwo);
            System.out.println(noOne + " * " + noTwo + " = " + change(multiply));
        }

        if (numOne[0] == 0 && numTwo[0] != 0) {
            System.out.println(noOne + " * " + noTwo + " = " + 0);
        } else if (numTwo[0] == 0) {
            System.out.println(noOne + " * " + noTwo + " = " + "Inf");
        } else {
            int[] divide = divide(numOne, numTwo);
            System.out.println(noOne + " * " + noTwo + " = " + change(divide));
        }

    }

    public static int[] add(int[] numOne, int[] numTwo) {
        if (numTwo[0] == 0) {
            return numOne;
        }
        if (numOne[0] == 0) {
            return numTwo;
        }
        // 计算相同分母
        int n = (numOne[0] * numTwo[0]) * divisor(numOne[1], numTwo[1]);
        // 分子相加
        int i = numOne[0] * n / numOne[1] + numTwo[0] * n / numTwo[1];
        // 约分 计算最大公因数 返回结果
        int divisor = divisor(i, n);
        System.out.println(divisor);
        return new int[]{i / divisor, n / divisor};
    }

    public static int[] subtract(int[] numOne, int[] numTwo) {
        if (numTwo[0] == 0) {
            return numOne;
        }
        if (numOne[0] == 0) {
            return numTwo;
        }
        // 计算相同分母
        int n = (numOne[0] * numTwo[0]) * divisor(numOne[1], numTwo[1]);
        // 分子相减
        int i = numOne[0] * n / numOne[1] - numTwo[0] * n / numTwo[1];
        // 约分 计算最大公因数 返回结果
        int divisor = divisor(i, n);
        return new int[]{i / divisor, n / divisor};
    }

    public static int[] multiply(int[] numOne, int[] numTwo) {
        // 分子相乘
        int i = numOne[0] * numTwo[0];
        // 分母相乘
        int n = numOne[1] * numTwo[1];
        // 约分
        int divisor = divisor(i, n);
        return new int[]{i / divisor, n / divisor};
    }

    public static int[] divide(int[] numOne, int[] numTwo) {
        // 乘以倒数
        // 分子相乘
        int i = numOne[0] * numTwo[1];
        // 分母相乘
        int n = numOne[1] * numTwo[0];
        // 约分
        int divisor = divisor(i, n);
        return new int[]{i / divisor, n / divisor};
    }

    public static int divisor(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        while (b > 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }

    public static String change(int[] num) {
        int no = num[0] / num[1];
        String noF = "";
        if (num[0] != 0) {
            noF = (num[0] - no * num[1]) + "/" + num[1];
            return no + " " + noF;
        }
        return no + "";
    }

}
