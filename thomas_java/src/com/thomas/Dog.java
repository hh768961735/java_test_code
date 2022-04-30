package com.thomas;

import com.thomas01.Animal;

/**
 *
 */
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("I like gutou!!!");
    }

    @Override
    public void speak() {
        System.out.println("I cant speak");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.speak();
    }/**/
}
