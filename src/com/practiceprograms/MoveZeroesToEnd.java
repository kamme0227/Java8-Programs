package com.practiceprograms;

public class MoveZeroesToEnd
{
    public static void main(String[] args)
    {
        int[] arr={2,6,0,4,0,5,0,7,0,5,0};
        int i;
        int j=0;
        for( i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<arr.length)
        {
            arr[j]=0;
            j++;
        }

        for(i=0;i<arr.length-1;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
