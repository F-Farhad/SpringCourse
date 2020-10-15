package ru.alishev.springcourse;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println("Do my Init");
    }

    public void doMyDestroy(){
        System.out.println("Do my destroy");
    }
}
