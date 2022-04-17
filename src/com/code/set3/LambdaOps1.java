package com.code.set3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaOps1 {
    public static void main(String args[])
    {
        String[] arr={"Hello","Peter","Hola","cat","jumbled"};
        Function<String,Integer> fn=  (word)->word.length();
        List<String> l=new ArrayList<>(Arrays.asList(arr));
        l.forEach((el)->
        {
           System.out.println(el+" : "+fn.apply(el)) ;
        });

    }
}
