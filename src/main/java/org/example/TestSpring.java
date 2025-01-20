package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = (ClassicalMusic) context.getBean("classicalMusic");
        ClassicalMusic classicalMusic2 = (ClassicalMusic) context.getBean("classicalMusic");

        boolean jaja = classicalMusic == classicalMusic2;

        System.out.println(jaja);

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //musicPlayer.play();
        context.close();
    }
}
