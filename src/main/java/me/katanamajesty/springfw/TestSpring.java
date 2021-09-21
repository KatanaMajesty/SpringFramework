package me.katanamajesty.springfw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.playMusic();
            musicPlayer.setPlayerName("Spotify 1");
            musicPlayer.setVolume(20);
            System.out.println(musicPlayer.getPlayerName());
            System.out.println(musicPlayer.getVolume());
            MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer1.playMusic();
            System.out.println(musicPlayer1.getPlayerName());
            System.out.println(musicPlayer1.getVolume());
        }
    }

}
