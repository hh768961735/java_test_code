package com.threeCharacter;

/**
 * @Author: Thomas
 * @Description: Java三大特性
 * @Date: Created in 21:31 2022/5/8
 * @Modified By:
 */
public class Characteristics {

//    1、封装
//    封装指隐藏对象的状态信息（属性），不允许外部对象直接访问对象的内部信息（private实现）。
//    但是可以提供一些可以被外界访问的方法来操作属性。
//    将类中成员变量private，提供public的get和set方法来控制属性的存取动作，以保证对私有属性操作的安全性：
    private String name;

    /**
     * 获取私有属性的方法
     * @return
     */
    public String getName(){
        return  this.name;
    }

    /**
     * 设置私有属性方法
     * @param aName
     */
    public void setName( String aName){
        this.name = aName;
    }

//    2、继承
//    继承extends：多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，那么多个类无需再定义这些属性和行为，只要继承单独的那个类即可。多个类可以称为子类，单独这个类称为父类或者超类。
//    继承是使用已存在的类的定义作为基础建立新类的技术，新类的定义可以增加新的属性或方法（对父类进行扩展），也可以拥有父类的属性和方法，并且通过自己的方法再次实现父类的方法（重写）。
//    通过使用继承，可以快速地创建新的类，可以提高代码的重用，程序的可维护性，节省大量创建新类的时间 ，提高我们的开发效率。

//    3、多态
//    多态：一种事物的多种形态（多态的前提：继承、重写、向上转型）
}

