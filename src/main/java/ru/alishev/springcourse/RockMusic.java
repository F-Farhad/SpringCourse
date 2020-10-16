package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    private String[] rocMusicArray = {"Wind cries Mary", "rockMusic2", "rockMusic3"};
    @Override
    public String[] getSong() {
        return rocMusicArray;
    }
}
