package me.katanamajesty.springfw;

import me.katanamajesty.springfw.components.Computer;
import me.katanamajesty.springfw.components.MusicPlayer;
import me.katanamajesty.springfw.music.ClassicalMusic;
import me.katanamajesty.springfw.music.DeathcoreMusic;
import me.katanamajesty.springfw.music.IMusic;
import me.katanamajesty.springfw.music.RockMusic;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class)) {
            Computer computer1 = context.getBean("computer", Computer.class);
            System.out.println(computer1);
            Computer computer2 = context.getBean("computer", Computer.class);
            System.out.println(computer2);
            System.out.println(computer2.getCOMPUTER_OS());
        }
    }

}

@Configuration
@ComponentScan("me.katanamajesty.springfw")
@PropertySource("classpath:musicPlayer.properties")
class SpringConfig {

    @Bean
    public DeathcoreMusic deathcoreMusic() {
        return DeathcoreMusic.getInstance();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return ClassicalMusic.getInstance();
    }

    @Bean
    public RockMusic rockMusic() {
        return RockMusic.getInstance();
    }

    @Bean
    @Scope("prototype")
    public MusicPlayer musicPlayer() {
        return MusicPlayer.getInstance(musicList());
    }

    @Bean
    @Scope("prototype")
    public Computer computer() {
        return new Computer(musicPlayer());
    }

    @Bean
    public List<IMusic> musicList() {
        List<IMusic> musicList = new ArrayList<>();
        musicList.add(deathcoreMusic());
        musicList.add(classicalMusic());
        musicList.add(rockMusic());
        return musicList;
    }

}
