/* Program to find the substring, implement using Regex
* input : This is Harry;
* output : true;
 */
package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImplementOfRegex {
    /*
    method to find substring using regex
     */
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
}
