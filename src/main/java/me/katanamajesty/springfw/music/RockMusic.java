package me.katanamajesty.springfw.music;

public class RockMusic implements IMusic {

    private RockMusic() {}

    public static RockMusic getInstance() {
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return "Black Parade by My Chemical Romance";
    }
}
