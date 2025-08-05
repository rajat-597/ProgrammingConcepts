package org.Capgemini;

import java.util.Scanner;

public class Fibonacci {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static void main(String[] args) {

        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0 , b = 1, sum = 0;
        System.out.print(a + " " + b + " ");

        for(int i = 3; i<=n; i++){
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }

    }
}
