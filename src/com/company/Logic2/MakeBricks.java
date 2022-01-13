package com.company.Logic2;

public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        if(goal > big * 5 + small) return false; // Not enough bricks.
        return goal % 5 <= small; // The remaining small bricks is not enough.
    }
}
