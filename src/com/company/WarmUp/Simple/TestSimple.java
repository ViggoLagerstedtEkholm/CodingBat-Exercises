package com.company.WarmUp.Simple;

import com.company.WarmUp.Simple.SleepIn.SleepIn;
import com.company.WarmUp.Simple.backAround.BackAround;
import com.company.WarmUp.Simple.diff21.diff21;
import com.company.WarmUp.Simple.missingChar.MissingChar;
import com.company.WarmUp.Simple.nearHundred.NearHundred;

public class TestSimple {

    public TestSimple(){
        //sleepIn()
        //diff21();
        //nearHundred();
        //missingChar();
        //backAround();
    }

    private void backAround(){
        BackAround backAround = new BackAround();

        String test1 = backAround.backAround("cat");
        String test2 = backAround.backAround("Hello");
        String test3 = backAround.backAround("a");

        System.out.println("Test1: " + test1);
        System.out.println("Test2: " + test2);
        System.out.println("Test3: " + test3);
    }

    private void missingChar(){
        MissingChar missingChar = new MissingChar();

        String test1 = missingChar.missingChar("Test", 0);
        String test2 = missingChar.missingChar("Test", 1);
        String test3 = missingChar.missingChar("Test", 2);
        String test4 = missingChar.missingChar("Test", 3);

        System.out.println("Test1: " + test1);
        System.out.println("Test2: " + test2);
        System.out.println("Test3: " + test3);
        System.out.println("Test4: " + test4);
    }

    private void nearHundred(){
        NearHundred nearHundred = new NearHundred();

        boolean test1 = nearHundred.nearHundred(90);
        boolean test2 = nearHundred.nearHundred(200);
        boolean test3 = nearHundred.nearHundred(223);

        System.out.println("Test1: " + test1);
        System.out.println("Test2: " + test2);
        System.out.println("Test3: " + test3);
    }

    private void diff21(){
        diff21 diff21 = new diff21();

        int test1 = diff21.diff21_test(19);
        int test2 = diff21.diff21_test(10);
        int test3 = diff21.diff21_test(21);

        System.out.println("Test1: " + test1);
        System.out.println("Test2: " + test2);
        System.out.println("Test3: " + test3);
    }

    private void sleepIn(){
        SleepIn sleepIn = new SleepIn();

        boolean test1 = sleepIn.sleepIn(false, false);
        boolean test2 = sleepIn.sleepIn(true, false);
        boolean test3 = sleepIn.sleepIn(false, true);

        System.out.println("Test1: " + test1);
        System.out.println("Test2: " + test2);
        System.out.println("Test3: " + test3);
    }
}
