package com.pe4;

public class CountNumOfOccurenceOfChar {
    public int countOccurence(String string, String ch){
        int count = 0;
        if((string != "\0") || (ch != "\0") || (string != " ") || (ch != " ")) {
            count = string.length() - string.replace(ch, "").length();
            return count;
        }
        else
            return  0;



    }
    public static void main(String[] args){
        CountNumOfOccurenceOfChar countNumOfOccurenceOfChar = new CountNumOfOccurenceOfChar();
        System.out.println(countNumOfOccurenceOfChar.countOccurence("Java is java again java again ","a"));
    }
}
