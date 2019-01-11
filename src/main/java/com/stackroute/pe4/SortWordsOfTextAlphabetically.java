/* Program to sort words lexicologically
* input : a quick brown fox jumps over the lazy dog
* output : "a","brown","dog","fox","jumps","lazy","over","quick","the"
 */
package com.stackroute.pe4;

public class SortWordsOfTextAlphabetically {
    /*
    method to sort the words of string in alphabetical order
     */
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
}
