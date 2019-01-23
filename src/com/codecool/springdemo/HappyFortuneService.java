package com.codecool.springdemo;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Happy happy happy";
    }
}
