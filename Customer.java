package com.hp.bean;

public class Customer {
    private String account,password,cname,paoneNum;
    private double money;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPaoneNum() {
        return paoneNum;
    }

    public void setPaoneNum(String paoneNum) {
        this.paoneNum = paoneNum;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", cname='" + cname + '\'' +
                ", paoneNum='" + paoneNum + '\'' +
                ", money=" + money +
                '}';
    }
}

