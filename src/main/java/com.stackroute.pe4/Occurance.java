package com.stackroute.pe4;

public class Occurance {

    public int occuranceFunc( String str ,char ch ){

        str = str.toLowerCase();
        String charAsStr = Character.toString(ch);
        charAsStr = charAsStr.toLowerCase();

        String  replacedStr = str.replace( charAsStr, "");

        int originalStrLength = str.length();
        int replacedStrLength = replacedStr.length();

        int occurance = originalStrLength - replacedStrLength ;

        return occurance;

    }

}
