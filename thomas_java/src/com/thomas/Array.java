package com.thomas;

/**
 * @Author: Thomas
 * @Description:
 * @Date: Created in 22:06 2022/4/28
 * @Modified By:
 */
public class Array {

    public static void main(String[] args) {
        int size = 10;

        double[] myList = new double[size];

        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 1;

        double total = 0;
        // for循环
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        // forEach

        for (double el: myList) {
            System.out.println(el);
        }
        System.out.println(total);


    }
}
