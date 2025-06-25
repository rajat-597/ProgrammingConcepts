package arrayConcepts;

public class MissingElement {
    public static void main(String[] args) {

        int arr [] = {1,2,3,5};

        // use natural number formula to calculate sum of natural numbers
        int n = arr.length+1;
        int totalSum = n*(n+1)/2;

        // calculate arraySum
        int sum = 0;
        for(int num:arr){
            sum = sum + num;
        }
        int missingNum = totalSum - sum;
        System.out.println("Missing number from the Array is " + missingNum);
    }
}
