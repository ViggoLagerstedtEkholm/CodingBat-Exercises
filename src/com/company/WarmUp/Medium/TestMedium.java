package com.company.WarmUp.Medium;

import com.company.WarmUp.Medium.stringTimes.StringTimes;

public class TestMedium {
    public TestMedium(){
        stringTimes();
    }

    private void stringTimes(){
        StringTimes stringTimes = new StringTimes();
        String test1 = stringTimes.stringTimes("Hi", 2);
        String test2 = stringTimes.stringTimes("Hi", 3);
        String test3 = stringTimes.stringTimes("Hi", 1);

        System.out.println("Test1: " + test1);
        System.out.println("Test2: " + test2);
        System.out.println("Test3: " + test3);
    }
}
