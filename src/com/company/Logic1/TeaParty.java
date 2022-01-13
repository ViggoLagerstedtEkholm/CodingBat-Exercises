package com.company.Logic1;

public class TeaParty {
    public int teaParty(int tea, int candy) {
        int rating = 0;

        if(tea >= 5 && candy >= 5){
            rating =  1;
        }

        if(tea >= candy * 2 || candy >= tea * 2){
            rating = 2;
        }

        if(tea < 5 || candy < 5)
        {
            return 0;
        }

        return rating;
    }
}
