package com.company.Logic1;

public class TestLogic1 {
    public TestLogic1(){
        twoAsOne();
    }

    private void twoAsOne(){
        TwoAsOne twoAsOne = new TwoAsOne();
        System.out.println("Test1: " + twoAsOne.twoAsOne(1, 2, 3));
        System.out.println("Test2: " + twoAsOne.twoAsOne(3,1,2));
        System.out.println("Test3: " + twoAsOne.twoAsOne(3,2,2));
    }

    private void teaParty(){
        TeaParty teaParty = new TeaParty();
        System.out.println("Test1: " + teaParty.teaParty(6, 8));
        System.out.println("Test2: " + teaParty.teaParty(3, 8));
        System.out.println("Test3: " + teaParty.teaParty(20, 6));
    }

    private void nearTen(){
        NearTen nearTen = new NearTen();
        System.out.println("Test1: " + nearTen.nearTen(12));
        System.out.println("Test2: " + nearTen.nearTen(17));
        System.out.println("Test3: " + nearTen.nearTen(19));
    }

    private void more20(){
        More20 more20 = new More20();
        System.out.println("Test1: " + more20.more20(20));
        System.out.println("Test2: " + more20.more20(21));
        System.out.println("Test3: " + more20.more20(22));
    }

    private void love6(){
        Love6 love6 = new Love6();
        System.out.println("Test1: " + love6.love6(6, 4));
        System.out.println("Test2: " + love6.love6(4, 5));
        System.out.println("Test3: " + love6.love6(1, 5));
    }

    private void caughtSpeeding(){
        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();
        System.out.println("Test1: " + caughtSpeeding.caughtSpeeding(60, false));
        System.out.println("Test2: " + caughtSpeeding.caughtSpeeding(65, false));
        System.out.println("Test3: " + caughtSpeeding.caughtSpeeding(65, true));
    }

    private void cigarParty(){
        CigarParty cigarParty = new CigarParty();
        System.out.println("Test1: " + cigarParty.cigarParty(30, false));
        System.out.println("Test2: " + cigarParty.cigarParty(50, false));
        System.out.println("Test3: " + cigarParty.cigarParty(70, true));
    }
}
