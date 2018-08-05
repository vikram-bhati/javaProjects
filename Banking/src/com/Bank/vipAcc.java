package com.Bank;

public class vipAcc {
    private String name;
    private String creditLimit;
    private String email;


    vipAcc(){
        this("defaultName","default Value 0","None");
    }
    vipAcc(String name,String creditLimit){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email="NUll";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    vipAcc(String vipName, String creditLimit, String email){
        this.name=vipName;
        this.creditLimit=creditLimit;
        this.email=email;
    }

}
