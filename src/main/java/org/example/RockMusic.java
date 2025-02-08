package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component ("rockMusic")
public class RockMusic implements Music {
    List<String> list = new ArrayList<>();
    Random random = new Random();

    public RockMusic () {
        list.add("AC/DC - TNT");
        list.add("Metallica - SandMan");
        list.add("LinkedPark - Naruto");
    }

    @Override
    public String getSong() {
        return list.get(random.nextInt(list.size()));
    }
}
