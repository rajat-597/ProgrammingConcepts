package arrayConcepts;

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60,70};
        int target = 20;

        int start = 0;
        int end = arr.length-1;
        boolean found = false;

        while(start<=end) {
            int mid = (start + end) / 2;
            if(target == arr[mid]){
                found =true;
                System.out.println(target + " Element found at " + mid + " position");
                break;
            }else if(arr[mid]<target){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }

        if(!found){
            System.out.println("Element not found");
        }

    }
}
