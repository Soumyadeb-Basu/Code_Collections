package com.code.set3;

import java.util.List;
import java.util.Arrays;
import java.util.function.Function;

public class LambdaOps2 {
    public static void main(String[] args)
    {
      Function<String,String> revStr= (word)->new StringBuffer(word).reverse().toString();
      Function<String,String> capitalFirstLetter=(newWord)->newWord.toUpperCase();
      Function<String,String> combineFunc=revStr.andThen(capitalFirstLetter);

     List<String> list= Arrays.asList(new String[]{"hello","world","Ethan","Drake"});
     list.forEach(word->{
         System.out.println(combineFunc.apply(word));
     });
    }
}
