package com.static_0505;
import java.util.Random;
/**
 * @Author: Thomas
 * @Description: final、static
 * @Date: Created in 22:01 2022/5/5
 * @Modified By:
 */
public class StaticStudy {
    static Random run = new Random();

    final int k1 = run.nextInt(10);

    // static final所修饰的字段仅占据内存的一个一份空间，一旦被初始化之后便不会被更改。
    static final int k2 = run.nextInt(10);

    // final灵活使用，使用构造器赋值
    final int k3;
    public StaticStudy(int x){
        this.k3 = x;
    }

    public static void main(String[] args) {
        StaticStudy ss = new StaticStudy(3);
        System.out.println("k1=" + ss.k1 + " k2=" + ss.k2);

        StaticStudy ss1 = new StaticStudy(6);

        System.out.println("k1=" + ss1.k1 + " k2=" + ss1.k2);
    }
}
