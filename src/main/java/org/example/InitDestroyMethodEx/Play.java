package org.example.InitDestroyMethodEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Play {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContextInitDestroy.xml");
        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2=context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("Music player name: "+musicPlayer.getName());
        System.out.println("Volume: "+musicPlayer.getVolume());
        musicPlayer.playingMusic();


        System.out.println("Music player name: "+musicPlayer2.getName());
        System.out.println("Volume: "+musicPlayer2.getVolume());
        musicPlayer.playingMusic();
        context.close();

    }
}
