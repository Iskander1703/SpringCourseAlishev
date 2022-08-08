package org.example.FactoryMethodEx;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    private void initMethod(){
        System.out.println("Music Player initialization in process...");
    }

    private void destroyMethod(){
        System.out.println("Music Player destroying in process...");
    }

    public MusicPlayer(){

    }

    public void playingMusic(){
        System.out.println("Now playing is "+music.getSong());
    }

    public void setMusic(Music music){
        this.music=music;
    }

    public Music getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
