package org.example.ScopeEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Play {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContextScope.xml");
        //Scope = Singletone
        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2=context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("Music player name: "+musicPlayer.getName());
        System.out.println("Volume: "+musicPlayer.getVolume());
        musicPlayer.playingMusic();
        System.out.println();
        System.out.println("Music player name: "+musicPlayer2.getName());
        System.out.println("Volume: "+musicPlayer2.getVolume());
        musicPlayer2.playingMusic();
        System.out.println("---------------------------------------");

        musicPlayer.setVolume(150);
        System.out.println("Music player name: "+musicPlayer.getName());
        System.out.println("Volume: "+musicPlayer.getVolume());
        musicPlayer.playingMusic();
        System.out.println();
        System.out.println("Music player name: "+musicPlayer2.getName());
        System.out.println("Volume: "+musicPlayer2.getVolume());
        musicPlayer2.playingMusic();
        System.out.println("---------------------------------------");
        musicPlayer.setVolume(300);
        System.out.println("Music player name: "+musicPlayer.getName());
        System.out.println("Volume: "+musicPlayer.getVolume());
        musicPlayer.playingMusic();
        System.out.println();
        System.out.println("Music player name: "+musicPlayer2.getName());
        System.out.println("Volume: "+musicPlayer2.getVolume());
        musicPlayer2.playingMusic();
        System.out.println("---------------------------------------");
        System.out.println("Is MusicPlayer == MusicPlayer2: "+(musicPlayer==musicPlayer2));
        context.close();
    }
}
