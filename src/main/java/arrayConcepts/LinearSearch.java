package arrayConcepts;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
         int arr[] = {2,3,4,6,8,1};

        System.out.println("Enter the target element ");
        Scanner sc= new Scanner(System.in);
        int target = sc.nextInt();

        boolean found = false;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                found = true;
                System.out.println("Element " + target + " found at index " + i);
                break;
            }
        }

        if(!found){
            System.out.println("Element not found ");
        }

    }
}
