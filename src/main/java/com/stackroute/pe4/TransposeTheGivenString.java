/* Program to transpose a string
*  input:a quick brown fox jumps over the lazy dog
*  output:a kciuq nworb xof spmuj revo eht yzal god
*/
package com.stackroute.pe4;

public class TransposeTheGivenString {
    /*
    method to transpose a string
    */
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
}
