package com.company;

public class BadPlayer extends Player{
    public int mistake;
    public BadPlayer(int mistake, int skill, String name, int age){
        super(skill, name, age);
        this.mistake = mistake;
    }

}
