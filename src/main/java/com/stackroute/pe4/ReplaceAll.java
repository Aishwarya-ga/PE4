/* Program which replaces all 'd' with f
* and all 'l' with 't'
*/
package com.stackroute.pe4;

public class ReplaceAll {
    /*
    method to replace all 'd' with 'f' and all 'l' with 't'
     */
    public String replaceAllWithOther(String string) {
        if((string != " ")) {
            String toLower = string.toLowerCase();
            String replacedString = toLower.replaceAll("d", "f").replaceAll("l", "t");
            return replacedString;
        }
        return null;

    }

}