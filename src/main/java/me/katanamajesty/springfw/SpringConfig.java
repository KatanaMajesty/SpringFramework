package me.katanamajesty.springfw;

import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("me.katanamajesty.springfw")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public DeathcoreMusic deathcoreMusic() {
        return DeathcoreMusic.getInstance();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
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
    public List<Music> musicList() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(deathcoreMusic());
        musicList.add(classicalMusic());
        musicList.add(rockMusic());
        return musicList;
    }

}
