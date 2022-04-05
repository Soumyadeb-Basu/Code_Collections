package com.code.set3;

import java.util.HashMap;
import java.util.Scanner;

public class StateNames {
    public static HashMap<String,String> stateName(String[] A)
    {
        HashMap<String,String> res=new HashMap<>();
        for(String st:A)
        {
            String init=st.substring(0,3).toUpperCase();
            res.put(init,st);
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements and the array elements");
        int n=sc.nextInt();
        String[] a= new String[n];
        for(int j=0;j<n;j++)
            a[j]=sc.next();
        System.out.println(stateName(a));
    }
}
