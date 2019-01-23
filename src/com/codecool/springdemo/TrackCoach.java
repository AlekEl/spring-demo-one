package com.codecool.springdemo;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Runs fast as hell!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
