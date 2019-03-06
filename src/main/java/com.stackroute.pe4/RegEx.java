package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public String regexFunc(String str){

        boolean flag = false;
        String output = "Is Harry here ? ";

        Pattern pattern  = Pattern.compile("Harry");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()){
            flag = true;
        }
        else {
            flag  = false;
        }
        output = output + flag;

        return output;

    }


}
