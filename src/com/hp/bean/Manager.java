package com.hp.bean;

public class Manager {
    private String accout,password,mname;
    public String getAccout() {
        return accout;
    }

    public void setAccout(String accout) {
        this.accout = accout;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMname() {
        return mname;
    }
    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "accout='" + accout + '\'' +
                ", password='" + password + '\'' +
                ", mname='" + mname + '\'' +
                '}';
    }
}
