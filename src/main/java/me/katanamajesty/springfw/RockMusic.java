package me.katanamajesty.springfw;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Black Parade by My Chemical Romance";
    }
}
