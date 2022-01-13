package com.company.String2;

public class TestString2 {
    public TestString2(){
        repeatEnd();
    }

    private void repeatEnd(){
        RepeatEnd repeatEnd = new RepeatEnd();
        repeatEnd.repeatEnd("Hello", 3);
    }

    private void bobThere(){
        BobThere bobThere = new BobThere();
        boolean result = bobThere.bobThere("bac");
        System.out.println(result);
    }
}
