package com.practiceprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements
{
    public static void main(String[] args)
    {
        List<Integer>listOfIntegers= Arrays.asList(111,222,333,555,999,777,555,888,999);
        Set<Integer>uniqueElements=new HashSet<>();
        Set<Integer>duplicateElements=listOfIntegers.stream().filter(i->!uniqueElements.add(i)).collect(Collectors.toSet());
        System.out.println(duplicateElements);
    }
}
