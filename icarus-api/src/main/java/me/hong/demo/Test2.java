package me.hong.demo;

/**
 * ++i和i++的区别
 * 在实际运算中，++i会先+1再用结果值运算，i++会先用i进行计算
 */
public class Test2 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("++i :" + ++i);
        System.out.println("i++ :" + i++);

        int m = 7;
        int n = 7;
        int a = 2 * ++m;
        int b = 2 * n++;
        System.out.println("a : " + a); //16，计算时m=8
        System.out.println("b : " + b); //14，计算时n=7
    }
}
