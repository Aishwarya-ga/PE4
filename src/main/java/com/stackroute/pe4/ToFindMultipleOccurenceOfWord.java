/* Program to find multiple occurence along with their indexes
*  input : She sells seashells by the seashore
*    patternInput : se
*    ouput : Found at 4-6
*            Found at 10-12
*            Found at 27-29
*/
package com.stackroute.pe4;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToFindMultipleOccurenceOfWord {
    /*
    method to find multiple occurence along with their indexes
    */
    public List<String> toFindMultipleOccurence(String string ,String patternInput){
        List<String> formatString = new LinkedList<String>();
        if(string != " ") {
            Pattern pattern = Pattern.compile(".*se.*");
            Matcher matcher = pattern.matcher(string);
            String keyword = patternInput;
            int i = 0;
            if (matcher.matches()) {
                int index = string.indexOf(keyword);
                while (index >= 0) {
                    formatString.add(String.format("Found at %d-%d", index, index + keyword.length()));
                    index = string.indexOf(keyword, index + keyword.length());
                }
                return formatString;
            }
        }
        return null;
    }
}
