package org.Capgemini;

public class InputString {

    //abcd -- abbcccdddd
    public static void main(String[] args) {

        String str = "abcd";

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            for(int j =0; j<=i; j++){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
