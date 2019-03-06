package com.stackroute.pe4;

public class TransposeString {

    public String transposeFunc(String str){

        String output = new String();

        String[] strArr = str.split(" ");

        for(String s : strArr){

            StringBuilder sb = new StringBuilder();

            sb.append(s);

            sb = sb.reverse();

            output += sb.toString()  + " ";

        }

        return output.trim();
    }

}
