package com.hp.service;
//此类是完成客户的所有业务（增删改查）
import com.hp.bean.Customer;
import com.hp.bean.CustomerData;
import com.hp.util.TextUtil;
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
                goGetMoneyHome();
                doSelectMoney();
                goOneHome();
                break;
            case "3":
                doTruanMoney();
                goOneHome();
                break;
            case "4":
                //cunkuan();
                goSetMoneyHome();
                doSelectMoney();
                goOneHome();
                break;
            case "5":
                goodbye();
                break;
        }
    }
    //查询余额
    private void doSelectMoney() {
        double money = currentCustomer.getMoney();
        System.out.println("余额是 " +money);
    }

    //取款
    private void goGetMoneyHome(){
        TextUtil.getMoneyUI();
        Scanner sc = new Scanner(System.in);
        String numIn = sc.nextLine();
        if (numIn.equals("1")) {
            //取款100  那么就让顾客的钱-100
            double money = currentCustomer.getMoney();
            money=money-100;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }
        if(numIn.equals("2")){
            //取款200  那么就让顾客的钱-200
            double money = currentCustomer.getMoney();
            money=money-200;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }
        if(numIn.equals("3")){
            //取款300  那么就让顾客的钱-300
            double money = currentCustomer.getMoney();
            money=money-300;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }
        if(numIn.equals("4")){
            //取款500  那么就让顾客的钱-500
            double money = currentCustomer.getMoney();
            money=money-500;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }
        if(numIn.equals("5")){
            //取款800  那么就让顾客的钱-800
            double money = currentCustomer.getMoney();
            money=money-800;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }if(numIn.equals("6")){
            //取款1000  那么就让顾客的钱-1000
            double money = currentCustomer.getMoney();
            money=money-1000;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }if(numIn.equals("7")){
            //取款2000  那么就让顾客的钱-2000
            double money = currentCustomer.getMoney();
            money=money-2000;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }
        if(numIn.equals("8")){
            double money = currentCustomer.getMoney();
            System.out.println("请输入取款金额:");
            Scanner scanner = new Scanner(System.in);
            double getMoney = scanner.nextDouble();
            if (getMoney%100 == 0) {
                money=money-getMoney;
                System.out.println("您的余额是"+money);
                currentCustomer.setMoney(money);
            }else{
                System.out.println("不好意思不能取零钱");
            }
        } else{
            System.out.println("输入有误,请输入1-8进行选择");
        }
    }

    //存款
    private void goSetMoneyHome(){
        TextUtil.setMoneyUI();
        Scanner sc = new Scanner(System.in);
        String numIn = sc.nextLine();
        if (numIn.equals("1")) {
            //存款100  那么就让顾客的钱+100
            double money = currentCustomer.getMoney();
            money=money+100;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }
        if (numIn.equals("2")) {
            //存款200  那么就让顾客的钱+200
            double money = currentCustomer.getMoney();
            money=money+200;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }
        if (numIn.equals("3")) {
            //存款300  那么就让顾客的钱+300
            double money = currentCustomer.getMoney();
            money=money+300;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }
        if (numIn.equals("4")) {
            //存款500  那么就让顾客的钱+500
            double money = currentCustomer.getMoney();
            money=money+500;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }
        if (numIn.equals("5")) {
            //存款800  那么就让顾客的钱+800
            double money = currentCustomer.getMoney();
            money=money+800;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }
        if (numIn.equals("6")) {
            //存款1000  那么就让顾客的钱+1000
            double money = currentCustomer.getMoney();
            money=money+1000;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }
        if (numIn.equals("7")) {
            //存款2000  那么就让顾客的钱+2000
            double money = currentCustomer.getMoney();
            money=money+2000;
            System.out.println("您的余额是"+money);
            currentCustomer.setMoney(money);
        }
        if (numIn.equals("8")) {
            double money = currentCustomer.getMoney();
            System.out.println("请输入存款金额:");
            Scanner scanner = new Scanner(System.in);
            double setMoney = scanner.nextDouble();
            if (setMoney%100 == 0) {
                money=money+setMoney;
                System.out.println("您的余额是"+money);
                currentCustomer.setMoney(money);
            }else{
                System.out.println("不好意思不收零钱");
            }
        } else{
            System.out.println("输入有误,请输入1-8进行选择");
        }
    }

    //转账
    private void doTruanMoney(){
        System.out.println("请输入对方账户:");
        Scanner scanner = new Scanner(System.in);
        String otherAccout = scanner.nextLine();
        System.out.println("请输入需要转账的金额");
        double otherMoneyInt = scanner.nextDouble();
        //做计算 自己的钱-转账给别人的钱(othrtMoney)
        double currentMoney = currentCustomer.getMoney()-otherMoneyInt;//减去转账后自己剩的钱
        //别人加钱  根据otherAccount
        Customer other = null;
        for (Customer customer : customerList) {
            if (customer.getAccount().equals(otherAccout)) {
                other = customer;
            }
        }
            double otherOneMoney = other.getMoney()+otherMoneyInt; //转账后别人剩的总钱数

            currentCustomer.setMoney(currentMoney);//自己剩余的钱存到自己账户
            other.setMoney(otherOneMoney);//别人的总钱数存到别人账户
        System.out.println("otherOneMoney = " + otherOneMoney);
    }

    //存款
    /*private void cunkuan(){
        Scanner sc = new Scanner(System.in);
        double money2 = sc.nextDouble();
        System.out.println("cun了"+money2+"元" );
        double money = currentCustomer.getMoney();
        double money3 =  money+money2;
        currentCustomer.setMoney(money3);
    }*/



    private  void goOneHome( ){
        TextUtil.oneLeveOption(); //运行返回界面
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("option1 = " + option);
        oneOption(option);  // 递归算法
    }

    private void goodbye(){
        System.out.println("输入y/n选择继续或退出");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a =="y") {
            TextUtil.welcome();
        }
    }
}
