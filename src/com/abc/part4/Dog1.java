package com.abc.part4;

public class Dog1 {
    public String dogName;

    public void jump() {
        System.out.println("Dog jump~");
    }

    public void run() {
        dogName = "小花花";
        Dog1 dog = new Dog1();
        dog.jump();//假设Dog run的前提是Dog jump
        System.out.println("Dog run~");
    }
}
