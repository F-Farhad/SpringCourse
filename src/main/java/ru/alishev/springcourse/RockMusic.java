package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component//id создается автоматически rockMusic
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
