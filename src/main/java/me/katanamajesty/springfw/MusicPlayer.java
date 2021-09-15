package me.katanamajesty.springfw;

public class MusicPlayer {

    private Music music;
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

    public void setMusic(Music music) {
        this.music = music;
    };

    // Inversion of Control
//    public MusicPlayer() {
//        // ignored
//    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
