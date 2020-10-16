package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music popMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("popMusic") Music popMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.popMusic = popMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(Genre genre){
        Random random = new Random();
        int count = random.nextInt(3);
        switch (genre){
            case CLASSICAL:
                System.out.println(classicalMusic.getSong()[count]);
                break;
            case ROCK:
                System.out.println(rockMusic.getSong()[count]);
                break;
            case POP:
                System.out.println(popMusic.getSong()[count]);
                break;
        }

    }
}
