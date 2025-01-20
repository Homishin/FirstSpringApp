package org.example;

import org.springframework.stereotype.Component;

@Component ("classicalMusic")
public class ClassicalMusic implements Music {


    public void doMyInit(){
        System.out.println("ClassicalMusic doMyInit");
    }

    public void doMyDestroy(){
        System.out.println("ClassicalMusic doMyDestroy");
    }

    @Override
    public String getSong() {
        return "Vivaldi - Summer";
    }
}
