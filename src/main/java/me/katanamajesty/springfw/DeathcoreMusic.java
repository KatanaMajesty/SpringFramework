package me.katanamajesty.springfw;

public class DeathcoreMusic implements Music {

    private DeathcoreMusic() {}

    public static DeathcoreMusic getInstance() {
        System.out.println("1. Getting instance from DeathcoreMusic.getInstance()");
        return new DeathcoreMusic();
    }

    private void onInit() {
        System.out.println("2. Deathcore initialization");
    }

    private void onDestroy() {
        System.out.println("End. Deathcore destruction");
    }

    @Override
    public String getSong() {
        return "Lorna Shore - ...And I Return to Nothingness";
    }
}
