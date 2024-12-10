package com.practiceprograms;

import java.util.Scanner;

public class CharcterOccurences
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input string");
        String inputString=sc.nextLine();
        System.out.println("Enter the character to count");
        char character=sc.next().charAt(0);
       // inputString=inputString.toLowerCase();
       // character=Character.toLowerCase(character);
        int count=0;
        int i;
        for(i=0;i<inputString.length();i++)
        {
            if(inputString.charAt(i)==character)
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
