package com.hp.util;

import java.util.Scanner;

public class TextUtil {
    //welcome的界面
    // static 修饰方法, 1. 可以 直接 被 类名.方法() 调用  2. 在内存中只有1份, 其他修改,他会跟着修改
    // 还有. 关于 static 静态 代码块.  他一般适用于 界面场景的提前加载, 如 王者荣耀中 峡谷的轮廓永远优先英雄出现.
    //    static{
    //         这就叫做 静态代码块
    //    }
    //提取成为一个工具类
    public static void welcome(){
        System.out.println("****************");
        System.out.println("欢迎使用atm取款机");
        System.out.println("****************");
    }

    // 客户的 1级 选择  提取成一个工具类
    public static void oneLeveOption(){
        System.out.println("*****************************************");
        System.out.println("********请输入你想要的操作类型：*********");
        System.out.println("********1.余额查询        2.取款*********");
        System.out.println("********3.转账            4.存款*********");
        System.out.println("********5.退卡                  *********");
        System.out.println("*****************************************");
    }
        //取款界面
        //static 方法带有static的方法是静态方方法  可以直接用类名点方法名调用
    public static  void getMoneyUI(){
        System.out.println("************************************************");
        System.out.println("********请输入您想取款的数目：**********");
        System.out.println("********1.100           2.200 *********");
        System.out.println("********3.300           4.500 *********");
        System.out.println("********5.800           6.1000*********");
        System.out.println("********7.2000          8.其他*********");
        System.out.println("************************************************");
    }

    //存款界面
    //static 方法带有static的方法是静态方方法  可以直接用类名点方法名调用
    public static  void setMoneyUI(){
        System.out.println("**************************************");
        System.out.println("********请输入您想存款的数目：*********");
        System.out.println("********1.100           2.200 ********");
        System.out.println("********3.300           4.500 ********");
        System.out.println("********5.800           6.1000********");
        System.out.println("********7.2000          8.其他********");
        System.out.println("**************************************");
    }
}
