package com.pe4;

import java.util.Arrays;

public class SortWordsOfTextAlphabetically {
    public String[] toSortAlphabeticalOrder(String inputString) {
        if ((inputString != " ")) {
            String temp;
            String[] string = inputString.toLowerCase().split(" ");
            int length = string.length;
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (string[i].compareTo(string[j]) > 0) {
                        temp = string[i];
                        string[i] = string[j];
                        string[j] = temp;
                    }
                }
            }
            return string;
        }
        return null;
    }
    public static void main(String[] args){
        SortWordsOfTextAlphabetically sortWordsOfTextAlphabetically = new SortWordsOfTextAlphabetically();
        String[] string = sortWordsOfTextAlphabetically.toSortAlphabeticalOrder("a quick brown fox jumps over the lazy dog");
        for(int i = 0; i<string.length;i++) {
            System.out.println(string[i]);
        }
    }
}
