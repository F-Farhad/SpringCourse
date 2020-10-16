package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private String[] classicalMusicArray = {"Hungarian Rhapsody", "Summer storm", "Joke"};

    @Override
    public String[] getSong() {
        return classicalMusicArray;
    }
}
