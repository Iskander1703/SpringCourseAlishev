package org.example.Test3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Play {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContextforTest3.xml");
//        MusicPlayer musicPlayer=new MusicPlayer(context.getBean("rockMusicBean", RockMusic.class));

        //Внедрение зависимости через конструктор
        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("Music player name: "+musicPlayer.getName());
        System.out.println("Volume: "+musicPlayer.getVolume());
        musicPlayer.playingMusic();

        System.out.println();

        MusicPlayer musicPlayer2=context.getBean("musicPlayer2", MusicPlayer.class);
        System.out.println("Music player name: "+musicPlayer2.getName());
        System.out.println("Volume: "+musicPlayer2.getVolume());
        musicPlayer.playingMusic();
        context.close();

    }
}
