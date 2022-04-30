package com.thomas;

/**
 * @Author: Thomas
 * @Description: this
 * @Date: Created in 15:17 2022/4/30
 * @Modified By:
 */
public class ThisTest {
    static String name;
    // 类初始化
    static {
        name = "Thomas";
    }

    public void hello(){
        String name = "Amy";
        System.out.println(name); // "Amy"
        System.out.println(this.name); // "Thomas"
    }

    public void hi(){
        this.hello();
    }

    public static void main(String[] args) {
        ThisTest test = new ThisTest();
        test.hi();
    }
}
