package org.example.QualifierAnnotationEx;

import org.springframework.stereotype.Component;

@Component(value = "rapMusic")
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Solider";
    }
}
