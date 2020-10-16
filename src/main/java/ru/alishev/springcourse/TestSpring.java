package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

       ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic.getName());
        System.out.println(classicalMusic.getVolume());


        context.close();
    }
}
