package com.stackroute.pe4;

public class StringBuilderUse {

    public String stringBuilderFunc(String str) {

        StringBuilder data = new StringBuilder();

        data.append(str);

        data = data.reverse();

        String output = data.toString();

        return output;
    }
}
