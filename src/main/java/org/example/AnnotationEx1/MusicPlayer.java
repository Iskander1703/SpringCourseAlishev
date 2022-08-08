package org.example.AnnotationEx1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "musicPlayer")
public class MusicPlayer {
    @Autowired
    private ClassicalMusic classicalMusic;
    private RapMusic rapMusic;
    private RockMusic rockMusic;

    @Value(value = "Panasonic-3000")
    private String name;
    @Value(value = "20")
    private int volume;



    @Autowired
    public MusicPlayer(RockMusic rockMusic) {
        this.rockMusic = rockMusic;
    }

    @Autowired
    public void setRapMusic(RapMusic rapMusic) {
        this.rapMusic = rapMusic;
    }

    public MusicPlayer(){

    }

    public void playingRockMusic(){
        System.out.println("Now playing is "+rockMusic.getSong());
    }

    public void playingClassicMusic(){
        System.out.println("Now playing is "+classicalMusic.getSong());
    }

    public void playingRapMusic(){
        System.out.println("Now playing is "+rapMusic.getSong());
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
