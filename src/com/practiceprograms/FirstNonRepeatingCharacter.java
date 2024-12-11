package com.practiceprograms;

import java.util.HashMap;

public class FirstNonRepeatingCharacter
{
    public static int firstUniqChar(String s)
    {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(hashMap.get(ch)==1)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        String input="anusha";
        int result=firstUniqChar(input);
        System.out.println("The index of first non-repeating character is "+result);

    }
}
