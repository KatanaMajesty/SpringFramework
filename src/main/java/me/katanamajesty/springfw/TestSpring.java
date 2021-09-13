package me.katanamajesty.springfw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Music musicObject = context.getBean("musicBean", Music.class);
            (new MusicPlayer(musicObject)).playMusic();
        }
    }

}
