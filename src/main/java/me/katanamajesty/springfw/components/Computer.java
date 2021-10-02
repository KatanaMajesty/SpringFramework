package me.katanamajesty.springfw.components;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

public class Computer {
    @Value("${computer.operatingSystem}")
    private String COMPUTER_OS;
    private final MusicPlayer musicPlayer;

    public String getCOMPUTER_OS() {
        return COMPUTER_OS;
    }

    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @PostConstruct
    public void onInit(/*Здесь не должно быть параметров*/) {
        System.out.printf("Object %s has been created.\nObject hashcode: %d\n\n", this.getClass().getSimpleName(), this.hashCode());
    }

    // PreDestroy метод не вызывается, если scope бина - prototype
    @PreDestroy
    public void onDestroy(/*Здесь не должно быть параметров*/) {
        System.out.printf("Object %s has been destroyed.\nObject hashcode: %d\n\n", this.getClass().getSimpleName(), this.hashCode());
    }

    @Override
    public String toString() {
        Random random = new Random();
        MusicPlayer.MusicEnum musicEnum;
        switch (random.nextInt(3)) {
            case 0 -> musicEnum = MusicPlayer.MusicEnum.DEATHCORE;
            case 1 -> musicEnum = MusicPlayer.MusicEnum.CLASSICAL;
            case 2 -> musicEnum = MusicPlayer.MusicEnum.ROCK;
            default -> musicEnum = null;
        }
        return "Computer 1 is " + musicPlayer.playMusic(musicEnum) + "\n";
    }
}
