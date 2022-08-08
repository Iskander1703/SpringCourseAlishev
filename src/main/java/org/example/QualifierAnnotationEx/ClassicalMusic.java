package org.example.QualifierAnnotationEx;

import org.springframework.stereotype.Component;

@Component(value = "classicalMusic")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
