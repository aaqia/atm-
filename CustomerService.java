package com.hp.service;
//此类是完成客户的所有业务（增删改查）
import com.hp.bean.Customer;
import com.hp.bean.CustomerData;
import com.hp.util.TextUtil;

import java.awt.geom.CubicCurve2D;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    private List<Customer> customerList;
    private Customer currentCustomer;
    // 1.查询，登录  判断账号密码是否正确
    public void checkPwd(String cardid,String cardPwd){
        CustomerData customerData = CustomerData.getInstance();
        customerList = customerData.getCustomerList();
        //1.拿到 carid中的账户和cardPwd对list中的数据作对比
        System.out.println("cardid = " + cardid);
        System.out.println("cardPwd = " + cardPwd);

        for (Customer customer : customerList) {
            if (customer.getAccount().equals(cardid) && customer.getPassword().equals(cardPwd)){
                //拿出来这个人
                currentCustomer = customer;
                //账户正确
                System.out.println("欢迎"+customer.getCname()+"顾客登录！请注意您的安全");
                TextUtil.oneLeveOption();// 界面
                Scanner sc = new Scanner(System.in);
                String option = sc.nextLine();
                oneOption(option);
                //如何保证按了 1 3 5..让他在回到此界面
            }
        }
    }
    //提取成一个方法
    private void oneOption(String option){
        switch (option){
            case "1":
                System.out.println("余额查询");
                //查询余额外
                doSelectMoney();
                    //当按下1后，回退到1及选项
                goOneHome();
                break;
            case "2":
                System.out.println("请输入取多少钱:");
                qukuan();
                doSelectMoney();
                goOneHome();
                break;
            case "3":
                System.out.println("转账");
                goOneHome();
                break;
            case "4":
                System.out.println("请输入存多少钱");
                cunkuan();
                doSelectMoney();
                goOneHome();
                break;
            case "5":
                System.out.println("退卡");
                break;
        }
    }
    //查询余额
    private void doSelectMoney() {
        double money = currentCustomer.getMoney();
        System.out.println("余额是 " +money);
    }

    //取款
    private void qukuan(){
        Scanner sc = new Scanner(System.in);
        double money2 = sc.nextDouble();
        System.out.println("取了"+money2+"元" );
        double money = currentCustomer.getMoney();
        double money3 =  money-money2;
        currentCustomer.setMoney(money3);
    }

    //存款
    private void cunkuan(){
        Scanner sc = new Scanner(System.in);
        double money2 = sc.nextDouble();
        System.out.println("cun了"+money2+"元" );
        double money = currentCustomer.getMoney();
        double money3 =  money+money2;
        currentCustomer.setMoney(money3);
    }

    private  void goOneHome( ){
        TextUtil.oneLeveOption(); //运行返回界面
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("option1 = " + option);
        oneOption(option);  // 递归算法
    }
}
