package me.katanamajesty.springfw.music;

public class ClassicalMusic implements IMusic {

    private ClassicalMusic() {}

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
