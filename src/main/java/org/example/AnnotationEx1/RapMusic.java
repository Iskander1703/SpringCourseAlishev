package org.example.AnnotationEx1;

import org.example.Test4.Music;
import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Solider";
    }
}
