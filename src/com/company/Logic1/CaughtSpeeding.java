package com.company.Logic1;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int ticketSeverity = 0;
        int appliedBirthdaySpeed = 0;
        if(isBirthday){
            appliedBirthdaySpeed = 5;
        }

        if(speed <= 60 + appliedBirthdaySpeed){
            ticketSeverity = 0;
        }

        if(speed >= (61 + appliedBirthdaySpeed) && speed <= (80 + appliedBirthdaySpeed)){
            ticketSeverity = 1;
        }

        if(speed >= 81 + appliedBirthdaySpeed){
            ticketSeverity = 2;
        }

        return ticketSeverity;
    }
}
