package me.katanamajesty.springfw;

import java.util.List;

public class MusicPlayer {

    private List<Music> musicList;
    private String playerName;
    private int volume;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    };

    // Inversion of Control
//    public MusicPlayer() {
//        // ignored
//    }

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
