package com.company.Array2;

public class TestArray2 {
    public TestArray2(){
        centeredAverage();
    }

    private void centeredAverage(){
        CenteredAverage centeredAverage = new CenteredAverage();
        int[] arr1 = new int[]{ 1, 2, 3, 4, 100 };
        int[] arr2 = new int[]{ 1, 1, 5, 5, 10, 8, 7 };

        centeredAverage.centeredAverage(arr2);
    }

    private void haveThree(){
        HaveThree haveThree = new HaveThree();
        int[] arr1 = new int[]{ 3, 1, 3, 1, 3 };

        haveThree.haveThree(arr1);
    }

    private void bigDiff(){
        BigDiff bigDiff = new BigDiff();
        int[] arr1 = new int[]{ 10, 3, 5, 6 };

        bigDiff.bigDiff(arr1);
    }

    private void withoutTen(){
        WithoutTen withoutTen = new WithoutTen();
        int[] arr1 = new int[]{ 1, 10, 10, 2 };

        withoutTen.withoutTen(arr1);
    }

    private void post4(){
        Post4 post4 = new Post4();
        int[] arr1 = new int[]{ 2, 4, 1, 2 };

        post4.post4(arr1);
    }

    private void modThree(){
        ModThree modThree = new ModThree();
        //int[] arr1 = new int[]{ 2, 1, 3, 5 };
        //int[] arr2 = new int[]{ 2, 1, 2, 5 };
        //int[] arr3 = new int[]{ 2, 4, 2, 5 };
        int[] TEST1 = new int[]{ 9, 9, 9 };

        System.out.println("TEST1: " + modThree.modThree(TEST1));
       // System.out.println("Test2: " + modThree.modThree(arr2));
        //System.out.println("Test3: " + modThree.modThree(arr3));
    }

    private void matchUp(){
        MatchUp matchUp = new MatchUp();
        int[] arr1 = new int[]{ 1, 2, 3};
        int[] arr2 = new int[]{ 2, 3, 10};

        System.out.println("Test1: " + matchUp.matchUp(arr1, arr2));

    }

    private void lucky13(){
        //Implement later.
    }

    private void sum13(){
        Sum13 sum13 = new Sum13();
        int[] test1 = new int[]{ 1, 13, 1, 1 };
        System.out.println("Test1: " + sum13.sum13(test1));
    }

    private void countEvens(){
        CountEvents countEvents = new CountEvents();
        int[] test1 = new int[]{ 2, 1, 2, 3, 4 };
        int[] test2 = new int[]{ 2, 2, 0 };
        int[] test3 = new int[]{ 1, 3, 5 };

        System.out.println("Test1: " + countEvents.countEvens(test1));
        System.out.println("Test2: " + countEvents.countEvens(test2));
        System.out.println("Test3: " + countEvents.countEvens(test3));
    }
}
