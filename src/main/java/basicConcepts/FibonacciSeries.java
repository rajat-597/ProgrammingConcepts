package basicConcepts;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // sum of two number is 3rd number 0 1 1 2 3 5 8 13 21

        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        int sum = 0;
        for(int i = 3 ; i<=num; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
    }
}
