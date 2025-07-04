package arrayConcepts;

public class SumOnlyInteger {

    public static void main(String[] args) {
        String arr [] = {"a", "2", "3", "7","j","i","9"};

        int sum = 0;
        for(int i = 0; i< arr.length; i++) {
            try {
                sum = sum + Integer.parseInt(arr[i]);
            } catch (NumberFormatException e) {
             //   e.printStackTrace();
            }
        }
        System.out.println("Sum of Integer " +sum);
    }
}
