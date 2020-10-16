package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{
    private String[] popMusicArray = {"Если тебе будет грустно","popMusic2", "popMusic3"};
    @Override
    public String[] getSong() {
        return popMusicArray;
    }
}
