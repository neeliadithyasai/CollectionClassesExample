package com.lambton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        
        List c = new ArrayList<String>();

    }
}
