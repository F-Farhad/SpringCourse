package ru.alishev.springcourse;

public class ClassicalMusic implements Music {

    //паттерн фабричный метод, мы должны обьявить конструктор приватным и создавать обьект

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic(){   //метод который создает новый обьект
        return new ClassicalMusic();
    }
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
