package com.pe4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToFindMultipleOccurenceOfWord {
    public List<String> toFindMultipleOccurence(String string ,String pat){
        List<String> formatString = new LinkedList<String>();
        if(string != " ") {
            Pattern pattern = Pattern.compile(".*se.*");
            Matcher matcher = pattern.matcher(string);
            String keyword = pat;

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

    public static void main(String[] args){
        ToFindMultipleOccurenceOfWord toFindMultipleOccurenceOfWord = new ToFindMultipleOccurenceOfWord();
        List<String>output = toFindMultipleOccurenceOfWord.toFindMultipleOccurence("She sells seashells by the seashore ","se");
        for(int i = 0; i<output.size();i++){
            System.out.println(output.get(i));
        }
    }
}
