package me.katanamajesty.springfw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
        return "Computer 1 is " + musicPlayer.playMusic(MusicPlayer.MusicEnum.CLASSICAL) + "\n";
    }
}
