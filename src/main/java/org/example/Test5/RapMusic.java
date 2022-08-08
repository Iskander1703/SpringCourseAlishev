package org.example.Test5;

import org.example.Test4.Music;
import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Solider";
    }
}
