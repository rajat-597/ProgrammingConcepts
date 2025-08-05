package stringConcepts;

public class CountSpecificCharactersInString {

    public static void main(String[] args) {
        String input = "Rajat Kumar Sahoo";

        int count = 0;
        char ch = 'a';
        for(char c : input.toCharArray()){
            if(c == ch){
                count++;
            }
        }
        System.out.println("Number of Times a present in given Strings are " + count);
    }
}
