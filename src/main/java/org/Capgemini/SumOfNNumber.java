package org.Capgemini;

import java.util.Scanner;

public class SumOfNNumber {

    public static void main(String[] args) {

        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        while(n!=0){
            int num = n%10;
            sum = sum + num;
            n = n/10;
        }
        System.out.println("Sum of numbers " + sum);
    }
}
