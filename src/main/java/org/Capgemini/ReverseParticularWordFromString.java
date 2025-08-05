package org.Capgemini;

public class ReverseParticularWordFromString {

    public static void main(String[] args) {
        String input = "Selenium java Automation";
        String stringToReverse = "java";

        StringBuilder sb = new StringBuilder();
        for(String word : input.split(" ")){
            if(word.equalsIgnoreCase(stringToReverse)){
                String reverse = new StringBuilder(word).reverse().toString();
                sb.append(reverse);
            }else {
                sb.append(word);
            }
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
