package me.katanamajesty.springfw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

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

    public void playMusic() {
        for (Music m : musicList) {
            System.out.println("Playing: " + m.getSong());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
