package org.example.AnnotationEx1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    private MusicPlayer musicPlayer;

    public void onMusicPlayer(){
        System.out.println("Music player name: "+musicPlayer.getName());
        System.out.println("Volume: "+musicPlayer.getVolume());
        musicPlayer.playingRockMusic();
        musicPlayer.playingRapMusic();
        musicPlayer.playingClassicMusic();
    }
}
