package com.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImplementOfRegex {
    public boolean toFindSubStringUsingRegex(String string) {
        if (string != " ") {
            Pattern pattern = Pattern.compile(".*Harry.*");
            Matcher matcher = pattern.matcher(string);
            if (matcher.matches()) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args){
        ImplementOfRegex implementOfRegex = new ImplementOfRegex();
        System.out.println(implementOfRegex.toFindSubStringUsingRegex("This is Henry"));

    }
}
