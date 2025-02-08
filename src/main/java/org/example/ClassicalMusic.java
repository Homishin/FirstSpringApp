package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    List<String> list = new ArrayList<>();
    Random random = new Random();

    public ClassicalMusic() {
        list.add("«Времена года» Антонио Вивальди");
        list.add("Каприз №24 Никколо Паганини.");
        list.add("«Лунная соната» Людвига ван Бетховена");
    }


    @Override
    public String getSong() {
        return list.get(random.nextInt(list.size()));
    }
}
