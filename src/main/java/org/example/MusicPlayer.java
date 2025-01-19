package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();


    public MusicPlayer(){}

    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void play() {
        for (Music music : musicList) {
            System.out.println(music.getSong());
        }
    }
}
