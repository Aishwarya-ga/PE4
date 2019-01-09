package com.pe4;

public class ReplaceAll {
    public String replaceAllWithOther(String string) {
        if((string != " ")) {
            String toLower = string.toLowerCase();
            String replacedString = toLower.replaceAll("d", "f").replaceAll("l", "t");
            return replacedString;
        }
        return null;

    }

    public static void main(String[] args) {
        ReplaceAll replaceAll = new ReplaceAll();
        System.out.println(replaceAll.replaceAllWithOther("daily dry"));

    }
}