package com.github.hcsp.inheritance;

public class Rat extends Animal{

    public Rat(String name) {
        super(name);
        this.name = name;
    }

    public void zhizhi() {
        System.out.println("吱吱" + super.name);
    }
}
