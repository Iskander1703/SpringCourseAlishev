package org.example.Test2;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playingMusic(){
        System.out.println("Now playing is "+music.getSong());
    }
}
