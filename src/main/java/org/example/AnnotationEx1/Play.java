package org.example.AnnotationEx1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Play {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContextAnnotation.xml");

        MusicPlayer musicPlayer1=context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("Music player name: "+musicPlayer1.getName());
        System.out.println("Volume: "+musicPlayer1.getVolume());
        musicPlayer1.playingRockMusic();
        musicPlayer1.playingRapMusic();
        musicPlayer1.playingClassicMusic();

        System.out.println("------------------------------------------------");

        Computer computer=context.getBean("computer", Computer.class);
        computer.onMusicPlayer();
        context.close();

    }
}
