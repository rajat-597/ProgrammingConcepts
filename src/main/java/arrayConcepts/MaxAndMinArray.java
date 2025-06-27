package arrayConcepts;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int arr [] = {2,3,6,8,4,9,5};

        int max = arr[0];
        int min = arr[0];

        // Find Maximum
        for(int i =0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        // Find Minimum
        for(int j = 0; j<arr.length;j++){
            if(arr[j]<min){
                min = arr[j];
            }
        }

        System.out.println("Maximum element in the array is "+max);
        System.out.println("Minimum element in the array is "+min);
    }

}
