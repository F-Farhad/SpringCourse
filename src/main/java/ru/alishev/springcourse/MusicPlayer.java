package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music classicalMusic;

    @Autowired
    @Qualifier("classicalMusic")
    public void setClassicalMusic(Music classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(){
        System.out.println(classicalMusic.getSong());
    }
}
