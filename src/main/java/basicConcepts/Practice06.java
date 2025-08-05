package basicConcepts;

public class Practice06 {
    // Rajat Kumar Sahoo --> Sahoo Kumar Sahoo

    public static void main(String[] args) {
        String str = "Rajat Kumar Sahoo";

        String words[] = str.split(" ");

        StringBuilder sb = new StringBuilder();
       for(int i = words.length-1; i>=0; i--){
           sb.append(words[i]).append(" ");
       }
        System.out.println(sb.toString());
    }
}
