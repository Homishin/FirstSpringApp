package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
//        context.close();

        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = (ClassicalMusic) context.getBean("classicalMusic");
        ClassicalMusic classicalMusic2 = (ClassicalMusic) context.getBean("classicalMusic");

        System.out.println(classicalMusic1 == classicalMusic2);

    }
}
