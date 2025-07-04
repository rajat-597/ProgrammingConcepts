package arrayConcepts;

public class SelectionSort {
    public static void main(String[] args) {
        // selection sort -- it will first swap the first element with smallest element and then sort it

        int arr[] = {9, 14, 17, 8, 12, 6, 10};

        int min, temp = 0;
        for (int i = 0; i < arr.length; i++) {

            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i] ;
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
