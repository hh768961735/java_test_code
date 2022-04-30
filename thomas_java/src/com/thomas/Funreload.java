package com.thomas;

/**
 * @Author: Thomas
 * @Description: 方法重载
 * @Date: Created in 14:56 2022/4/30
 * @Modified By:
 */
public class Funreload {

    public int test(int a, int b){
        return a+b;
    }

    public String test(String a, int b){
        return a+b;
    }

    public double test(int a, double b){
        return  a+b;
    }

    public float test(double a, float b){
        return (float) (a+b);
    }
    public static void main(String[] args) {
        Funreload funreload = new Funreload();

        int result1 = funreload.test(1, 2);

        System.out.println(result1);

        String result2 = funreload.test("111", 2);

        System.out.println(result2);

        double result3 = funreload.test(1, 1);

        System.out.println(result3);


        float result4 = funreload.test(1, 1);

        System.out.println(result4);

    }
}
