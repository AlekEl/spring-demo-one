package com.codecool.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do workout you worm!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
