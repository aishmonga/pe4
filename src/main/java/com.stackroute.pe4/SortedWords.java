package com.stackroute.pe4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedWords {

    public List<String> SortFunc(String str){

        List<String> li = Arrays.asList(str.split(" +"));

        Collections.sort(li);

        return li;
    }

}
