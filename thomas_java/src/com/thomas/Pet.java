package com.thomas;

/**
 * @Author: Thomas
 * @Description: 构造器重载
 * @Date: Created in 21:30 2022/4/24
 * @Modified By:
 */
public class Pet {
    String name;
    String color;
    int age;

    public Pet(String aName, String aColor, int aAge){
        name = aName;
        color = aColor;
        age = aAge;
    }

    public Pet(String aName, int aAge){
        name = aName;
        age = aAge;
    }

    public Pet(String aName, String aColor){
        name = aName;
        color = aColor;
    }

    public Pet() {
        name = "Amy";
        color = "white";
        age = 1;
    }
    //重写toString方法以便格式化输出
    public String toString() {
        return "name=" + name + " color=" + color + " age=" + age;
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet("thoams", "blue", 10);
        Pet pet2 = new Pet("thoams1", "blue");
        Pet pet3 = new Pet("John", 3);
        Pet pet4 = new Pet();

        System.out.println(pet1);//等价于System.out.println(pet1.toStrng());
        System.out.println(pet2);
        System.out.println(pet3);
        System.out.println(pet4);

    }




}
