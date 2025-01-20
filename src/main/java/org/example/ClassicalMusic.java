package org.example;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }


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
