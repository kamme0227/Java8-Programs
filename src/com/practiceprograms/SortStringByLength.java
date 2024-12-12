package com.practiceprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringByLength
{
    public static void main(String[] args)
    {
        List<String> listOfStrings = Arrays.asList("java","C","C#","Python","PHP","Kotlin","C++");
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
