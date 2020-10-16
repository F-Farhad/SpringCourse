package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;

    @Autowired
    public void setClassicalMusic(ClassicalMusic classicalMusic){
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(){
        System.out.println(classicalMusic.getSong());
    }
}
