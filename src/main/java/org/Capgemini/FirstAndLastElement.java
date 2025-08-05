package org.Capgemini;

public class FirstAndLastElement {

    // Hello World (H d)
    public static void main(String[] args) {
        String input = "Hello World";

        if(input != null && input.length()>0){
           char firstCharacter =  input.charAt(0);
           char lastCharacter =  input.charAt(input.length()-1);

            System.out.println("First Character " + firstCharacter);
            System.out.println("last Character " + lastCharacter);


        }
    }
}
