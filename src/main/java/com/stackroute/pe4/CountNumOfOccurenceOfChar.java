/* Program to count the occurence of character
* input : "Java is java again java again";
* ouput : 10
 */
package com.stackroute.pe4;

public class CountNumOfOccurenceOfChar {
    /*
    method to count occurence of particular character
     */
    public int countOccurence(String string, String ch){
        int count = 0;
        if((string != "\0") || (ch != "\0") || (string != " ") || (ch != " ")) {
            count = string.length() - string.replace(ch, "").length();
            return count;
        }
        else
            return  0;
    }
}
