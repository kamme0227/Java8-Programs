package com.practiceprograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord
{
    public static void main(String[] args) {
        String str="Java Concept of the day";
        String reversedStr= Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(reversedStr);

    }
}
