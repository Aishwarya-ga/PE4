package com.pe4;

public class TransposeTheGivenString {
    public String toTransposeString(String string){
        if(string != " ") {
            String[] inputString = string.split(" ");
            StringBuilder reverseString = new StringBuilder();
            for (String words : inputString) {
                String reverseWord = new StringBuilder(words).reverse().toString();
                reverseString.append(reverseWord + " ");
            }
            return reverseString.toString().trim();
        }
        return null;
    }

    public static void main(String[] args){
        TransposeTheGivenString transposeTheGivenString = new TransposeTheGivenString();
        System.out.println(transposeTheGivenString.toTransposeString("a quick brown fox jumps over the lazy dog"));

    }
}
