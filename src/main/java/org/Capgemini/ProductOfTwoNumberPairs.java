package org.Capgemini;

public class ProductOfTwoNumberPairs {

    public static void main(String[] args) {
        int product = 24;

        for(int i=1; i<=product; i++){
            if(product%i == 0){
                int pair = product/i;
                System.out.println(i + " * "+ pair);
            }
        }
    }
}
