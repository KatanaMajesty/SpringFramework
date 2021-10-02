package me.katanamajesty.springfw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

public class MusicPlayer {

    public enum MusicEnum {
        ROCK, CLASSICAL, DEATHCORE
    }

    private List<Music> musicList;
    // ignored
//    private Music music1;
//    private Music music2;
//    private Music music3;
//
//    @Autowired
//    public MusicPlayer(@Qualifier("rockMusic") Music music1,
//                       @Qualifier("classicalMusic") Music music2,
//                       @Qualifier("deathcoreMusic") Music music3) {
//        this.music1 = music1;
//        this.music2 = music2;
//        this.music3 = music3;
//    }
    private MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public static MusicPlayer getInstance(List<Music> musicList) {
        return new MusicPlayer(musicList);
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    };

    public String playMusic(MusicEnum musicEnum) {
        switch (musicEnum) {
            case ROCK -> {
                return "Playing: " + musicList.get(2).getSong();
            }
            case CLASSICAL -> {
                return "Playing: " + musicList.get(1).getSong();
            }
            case DEATHCORE -> {
                return "Playing: " + musicList.get(0).getSong();
            }
            default -> {
                return null;
            }
        }
    }
}
