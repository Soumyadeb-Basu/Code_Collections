package com.code.set3;

import java.util.ArrayList;
import java.util.List;

public class ListOps {
    public List<Integer> commonEle(List<Integer> l1,List<Integer> l2)
    {   List<Integer> l3=new ArrayList<>();
        for(int i=0;i<l1.size();i++)
        {   int k=l1.get(i);
            if(l2.contains(k))
                continue;
            else
                l3.add(k);

        }
        return l3;
    }

    public static void main(String[] args)
    {

    }

}
