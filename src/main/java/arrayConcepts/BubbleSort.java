package arrayConcepts;

public class BubbleSort {
    // in bubble sort we compare two consecutive elements until highest element went to last
    public static void main(String[] args) {

        int temp;
        int [] arr = {23, 6,17,19,10};

        for(int i=0; i< arr.length; i++){ //   for round
            int flag = 0;
            for(int j=0;j< arr.length-1-i; j++){ // to compare two consecutive element
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }

        for(int i =0;i< arr.length;i++ ){
            System.out.print( arr[i] + " ");
        }

    }
}
