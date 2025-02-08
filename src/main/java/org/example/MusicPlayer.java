package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private TypeOfMusic typeOfMusic;

    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public String play(TypeOfMusic typeOfMusic) {
        if (typeOfMusic == TypeOfMusic.CLASSICALMUSIC){
           return music2.getSong();
        } else if (typeOfMusic == TypeOfMusic.ROCKMUSIC){
            return music1.getSong();
        }
        return "Unknown music type";
    }
}
