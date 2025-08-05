package basicConcepts;

public class Practice05 {

    // Accenture, tcs, infosys, capgemini -- reverse infosys
    public static void main(String[] args) {
        String input = "Accenture tcs infosys capgemini";
        String stringToBeReversed = "infosys";

        StringBuilder sb = new StringBuilder();

        for(String word : input.split("\\s")){
            if(word.equalsIgnoreCase(stringToBeReversed)){
               String reversedString =  new StringBuilder(word).reverse().toString();
               sb.append(reversedString);
            }else {
                sb.append(word);
            }
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());

    }
}
