package com.code.set3;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamOps1 {
    public static void main(String[] args)
    {
        List<Integer> numlist= Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9});

        Predicate<Integer> new_predicate= (num)-> num%2 != 0;
        Function<Integer,Integer> new_func= (newnum)->newnum*2;

        List<Integer> finalList = numlist
                .stream()
                .filter(new_predicate)
                .map(new_func)
                .collect(Collectors.toList());

        System.out.println(finalList);
    }
}
