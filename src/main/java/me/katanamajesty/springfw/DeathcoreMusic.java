package me.katanamajesty.springfw;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DeathcoreMusic implements Music {

    private DeathcoreMusic() {}

    public static DeathcoreMusic getInstance() {
        System.out.println("2. Getting instance from DeathcoreMusic.getInstance()");
        return new DeathcoreMusic();
    }

    @PostConstruct
    private void onInit() {
        System.out.println("1. Deathcore initialization");
    }

    @PreDestroy
    private void onDestroy() {
        System.out.println("End. Deathcore destruction");
    }

    @Override
    public String getSong() {
        return "Lorna Shore - ...And I Return to Nothingness";
    }
}
