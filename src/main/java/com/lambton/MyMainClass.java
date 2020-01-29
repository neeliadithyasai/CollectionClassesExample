package com.lambton;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;

import java.util.*;

public class MyMainClass
{
    public static void main(String[] args)
    {
        ArrayList<String >countryList = new ArrayList<>();
        countryList.add("canada");
        countryList.add("India");

        System.out.println(countryList.get(1));

        for(String name: countryList)
        {
            System.out.println(name);
        }



        for(int i=0; i<countryList.size(); i++)
        {
            System.out.println(countryList.get(i));
        }

        HashSet<String>c = new HashSet<>();
        c.add("A");
        c.add("Bca");
        c.add("bb");
        c.add("B");
        c.add("c");
        c.add("d");

        c.remove("B");
        for(String s:c)
        {
            System.out.println(s);
        }

        HashMap<String, String>hashMap = new HashMap<>();

        hashMap.put("IND","India");
        hashMap.put("NEP","Nepal");

        for (Map.Entry<String,String>entry:hashMap.entrySet())
        {
            System.out.println(entry.getKey()+ "-"+ entry.getValue());
        }

    }
}
