package org.example.QualifierAnnotationEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    @Qualifier(value = "musicPlayer")
    private MusicPlayer musicPlayer;

    public void onMusicPlayer(){
        System.out.println("Music player name: "+musicPlayer.getName());
        System.out.println("Volume: "+musicPlayer.getVolume());
        musicPlayer.playingRockMusic();
        musicPlayer.playingRapMusic();
        musicPlayer.playingClassicMusic();
    }
}
