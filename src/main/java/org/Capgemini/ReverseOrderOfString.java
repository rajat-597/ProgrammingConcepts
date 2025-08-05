package org.Capgemini;

public class ReverseOrderOfString {
    // Welcome to capgemini  -- capgemini to welcome

    public static void main(String[] args) {
        String input = "Welcome to capgemini";

        String [] words = input.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i = words.length-1; i>=0; i--){
            sb.append(words[i]).append(" ");
        }
        System.out.println("Reverse String "  + sb.toString());
    }
        }
