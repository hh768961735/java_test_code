package com.threeCharacter;

import java.io.IOException;
import java.util.EmptyStackException;

/**
 * 父类
 */
public class Animal {

    public int age;

    public String sex;

    public double weight;

    public void sout() {
        System.out.println("汪汪汪~~~");
    }

    public void eat() {
        System.out.println("吃吃吃~~~");
    }

    public static void main(String[] args){
        Dog dd = (Dog) new Animal();

        dd.eat();
    }
}

class Dog extends Animal {
    public String name;

    @Override
    public void eat() {
        System.out.println("别吃！！！");
    }

    public static void main(String[] args) {
        Dog dd = new Dog();

        dd.sout();

        dd.eat();

    }

}

