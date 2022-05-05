package com.final_0505;

/**
 * @Author: Thomas
 * @Description:
 * @Date: Created in 21:36 2022/5/5
 * @Modified By:
 */
class FinalStudy {
    private String myString = "222";

    private int length(){
        return  myString.length();
    }

    public String toMystring(){
        return "1";
    }

    public final void test(){
        System.out.println("test");
    }
    // final方法可以重载
    public final void test(int a){
        System.out.println(a);

    }

    public static void main(String[] args) {
        FinalStudy fs = new FinalStudy();

        int a = fs.length();
        System.out.println(a);

    }
}


//
class FinalSon extends FinalStudy{

    public int length(String b){
        return b.length();
    }

    // final修饰的父类方法，子类不可以重写
    //    public void test(){
    //
    //    }

    public static void main(String[] args) {
        FinalSon fi = new FinalSon();

        // 父类的公有方法
        fi.toMystring();
        // 子类的公有方法
        fi.length("test");
        // 父类的length方法无法访问
//        fi.length();
        fi.test();

        fi.test(1);

    }
}
