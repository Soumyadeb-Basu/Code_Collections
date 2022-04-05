package com.code.set3;

import java.util.Scanner;

public class Sum_of_numbers {
    public static int sumOfNum(String[] A)
    {
        int sum=0;
        for(String s:A)
        {
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch>='0' && ch<='9')
                    sum+=Integer.parseInt(String.valueOf(ch));
            }
        }

       return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array and array variables");
        int n=sc.nextInt();
        String[] A=new String[n];
        for(int i=0;i<n;i++)
            A[i]=sc.next();
        System.out.println(sumOfNum(A));
    }
}
