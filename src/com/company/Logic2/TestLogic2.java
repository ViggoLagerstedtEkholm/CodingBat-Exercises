package com.company.Logic2;

public class TestLogic2 {
    public TestLogic2(){
        makeBricks();
    }


    private void makeBricks(){
        MakeBricks makeBricks = new MakeBricks();
        System.out.println("Test1: " +  makeBricks.makeBricks(3, 1, 8));
        System.out.println("Test2: " +  makeBricks.makeBricks(3, 1, 9));
        System.out.println("Test3: " +  makeBricks.makeBricks(3, 2, 10));
    }
}
