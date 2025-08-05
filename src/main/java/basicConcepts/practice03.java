package basicConcepts;

public class practice03 {
 // Binary Search
    public static void main(String[] args) {

        int arr[] = {3,5,6,7,2,9,1};
        int target = 6;

        int start = 0;
        int end = arr.length-1;

        boolean flag = false;
        while (start<=end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                flag = true;
                System.out.println(target + " Element found at " + mid + " position");
                break;
            }else if(target> arr[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        if(!flag){
            System.out.println("element is not present ");
        }
    }
}
