package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("classicalMusic")    //явно указываем id
public class ClassicalMusic implements Music {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}
