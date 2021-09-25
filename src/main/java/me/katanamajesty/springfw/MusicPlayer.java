package me.katanamajesty.springfw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private List<Music> musicList;
    private String playerName;
    private int volume;

    public String getPlayerName() {
        return playerName;
    }

    @Value("#{musicPlayer.playerName}")
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getVolume() {
        return volume;
    }

    @Value("#{musicPlayer.volume}")
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Value("#{musicListBean}")
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    };

    public String playMusic() {
        return "Playing: " + musicList.get((new Random()).nextInt(3)).getSong();
    }
}
