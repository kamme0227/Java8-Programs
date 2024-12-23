package com.practiceprograms;

import java.util.Arrays;
import java.util.List;

public class StartingWithOne {
    public static void main(String[] args)
    {
        List<Integer> myList= Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().map(x->x+" ").filter(x->x.startsWith("1")).forEach(System.out::println);
    }
}
