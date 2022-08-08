package org.example.Test4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Play {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContextForTest4.xml");
//        MusicPlayer musicPlayer=new MusicPlayer(context.getBean("rockMusicBean", RockMusic.class));

        //Внедрение зависимости через конструктор
        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("Music player name: "+musicPlayer.getName());
        System.out.println("Volume: "+musicPlayer.getVolume());
        musicPlayer.playingMusic();
        context.close();

    }
}
