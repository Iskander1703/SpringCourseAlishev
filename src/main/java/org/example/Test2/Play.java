package org.example.Test2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Play {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        MusicPlayer musicPlayer=new MusicPlayer(context.getBean("rockMusicBean", RockMusic.class));

        //Внедрение зависимости через конструктор
        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playingMusic();
        context.close();

        //Внедрение зависимости через Сеттеры
    }
}
