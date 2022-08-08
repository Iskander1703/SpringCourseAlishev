package org.example.QualifierAnnotationEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "musicPlayer")
public class MusicPlayer {
    @Autowired
    @Qualifier(value = "classicalMusic")
    private Music classicalMusic;
    private Music rapMusic;
    private Music rockMusic;

    @Value(value = "Panasonic-3000")
    private String name;
    @Value(value = "20")
    private int volume;



    @Autowired
    public MusicPlayer(@Qualifier(value="rockMusic") Music rockMusic) {
        this.rockMusic = rockMusic;
    }

    @Autowired
    @Qualifier(value = "rapMusic")
    public void setRapMusic(Music rapMusic) {
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
