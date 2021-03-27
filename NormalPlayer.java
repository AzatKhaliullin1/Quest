package com.company;

public class NormalPlayer extends Player {
    public int mistake;
    public NormalPlayer(int mistake, int skill, String name, int age){
        super(skill, name, age);
        this.mistake = mistake;
    }

}
