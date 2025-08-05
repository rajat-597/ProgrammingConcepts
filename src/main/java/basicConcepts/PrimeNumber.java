package basicConcepts;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        // prime number -- if a number is divisible by 1 and itself

        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int flag = 0;
        for(int i= 2; i<num/2; i++){
            if(num%i==0){
                flag =1;
                break;
            }
        }
        if(flag ==1){
            System.out.println(num + " is not Prime number ");
        }else
        {
            System.out.println(num + " is Prime number ");
        }
    }
}
