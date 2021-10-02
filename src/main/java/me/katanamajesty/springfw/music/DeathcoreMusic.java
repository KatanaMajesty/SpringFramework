package me.katanamajesty.springfw.music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DeathcoreMusic implements IMusic {

    /*
    Factory method pattern!
    Приватный конструктор не позволяет создать объект с помощью new keyword.
    Тем не менее существует метод getInstance, который возвращает нам объект.
     */
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
