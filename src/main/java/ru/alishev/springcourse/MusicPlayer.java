package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> list = new ArrayList<>();

    public MusicPlayer(List<Music> list) {
        this.list = list;
    }

    public void playMusic(){
        Random random = new Random();
        int count = random.nextInt(3);
        switch (count){
            case 0:
                System.out.println(list.get(0).getSong());
                break;
            case 1:
                System.out.println(list.get(1).getSong());
                break;
            case 2:
                System.out.println(list.get(2).getSong());
                break;
        }

    }


}
