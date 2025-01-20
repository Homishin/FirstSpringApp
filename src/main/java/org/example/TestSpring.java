package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = (ClassicalMusic) context.getBean("classicalMusic");
        RockMusic rockMusic = (RockMusic) context.getBean("rockMusic");

        MusicPlayer musicPlayer = new MusicPlayer(classicalMusic);

        musicPlayer.play();

        musicPlayer = new MusicPlayer(rockMusic);

        musicPlayer.play();

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //musicPlayer.play();
        context.close();
    }
}
