package ru.alishev.springcourse;

public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Если тебе будет грустно";
    }
}