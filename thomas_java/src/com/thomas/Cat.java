package com.thomas;

import com.thomas01.Animal;

/**
 * @Author: Thomas
 * @Description:
 * @Date: Created in 22:18 2022/4/27
 * @Modified By:
 */
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("I like fish!!!");
    }

    @Override
    public void speak() {
        System.out.println("喵喵喵！！！");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.speak();
    }
}
