package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer == musicPlayer1);
        System.out.println(musicPlayer.getVolume() +" musicPlayer");
        System.out.println(musicPlayer1.getVolume()+" musicPlayer1");

        System.out.println(musicPlayer.getName());
        musicPlayer.setVolume(10);

        System.out.println(musicPlayer == musicPlayer1);
        System.out.println(musicPlayer.getVolume() +" musicPlayer");
        System.out.println(musicPlayer1.getVolume()+" musicPlayer1");


        musicPlayer.playMusic();


        context.close();
    }
}
