package org.Capgemini;

import java.util.Scanner;

public class SwappingNumber {

    public static void main(String[] args) {

        System.out.println("Enter First number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Second number ");
        int b = sc.nextInt();

        int temp;

        System.out.println("Before Swapping " + a + " " + b);

      /*  temp = a;
        a = b;
        b = temp; */

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping " + a + " " + b);

    }
}
