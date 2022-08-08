package org.example.AnnotationEx1;

import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
