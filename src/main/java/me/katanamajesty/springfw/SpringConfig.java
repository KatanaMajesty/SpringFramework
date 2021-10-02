package me.katanamajesty.springfw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("me.katanamajesty.springfw")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public List<Music> musicList() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(DeathcoreMusic.getInstance());
        musicList.add(new ClassicalMusic());
        musicList.add(new RockMusic());
        return musicList;
    }

}
