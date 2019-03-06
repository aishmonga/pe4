package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurance {

    public String occurance(String str){

        String output = new String();

        Pattern pattern = Pattern.compile("se");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            output += matcher.start() + " - "  + matcher.end() + " ";

        }

        return output.trim();
    }

}
