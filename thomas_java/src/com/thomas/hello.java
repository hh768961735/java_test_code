package com.thomas;
// 引入Scanner库
import java.util.Scanner;


public class hello {
    public static void main(String[] args) {
        //构造一个Scanner对象，命名为 in (你完全可以选择其他名字），并与System.in关联
        Scanner in = new Scanner(System.in);
        //标准输出流
        System.out.println("what is your name?");
        //调用nextLine方法，从控制台读取一个字符串，并赋值给name；
        //值得说明的是，从方法名上看，nextLine可以读取一行内容，实际上也是这样的，你可以输入一个很长很长的字符串，直到你敲下回车键。
        String name = in.nextLine();
        //同样，读取一个整数，并赋值给age
        System.out.println("How old are you");
        int age = in.nextInt();
        //打印刚刚输入的信息
        System.out.println("your name:" + name + "  your age:" + age);
    }

}
