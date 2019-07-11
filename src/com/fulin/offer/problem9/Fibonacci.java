package com.fulin.offer.problem9;

/**
 * 写一个函数， 输入n 求斐波那契（Fibonacci）数列的第n项
 * <p>
 * f(0) = 0
 * f(1) =1
 * f(n) = f(n-1) + f(n-2)
 * <p>
 * Created by fulin on 17-2-17.
 */
public class Fibonacci {


    public static void main(String[] args) {
        for (int i = 0; i < 45; i++) {
            System.out.println(fibonacci3(i));
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static int fibonacci2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] num = new int[n + 1];
        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i <= n; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        return num[n];
    }


    public static int fibonacci3(int n) {
        int first = 0;
        int second = 1;

        if (n == 0) {
            return first;
        }

        if (n == 1) {
            return second;
        }
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }
}
