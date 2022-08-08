package org.example.QualifierAnnotationEx;

import org.springframework.stereotype.Component;

@Component(value = "rockMusic")
public class RockMusic implements Music {

    private RockMusic(){

    }

    public static RockMusic getNewRockMusic(){
        System.out.println("Getting new Rock Music...");
        return new RockMusic();
    }
    @Override
    public String getSong() {
        return "We will rock you";
    }
}
