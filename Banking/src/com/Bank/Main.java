package com.Bank;

public class Main {
    public static void main(String[] args) {
    /*BankAcc vikram=new BankAcc();

    vikram.setCustomerName("Vikramaditya Singh Bhati");
    System.out.println("Customer Name="+vikram.getCustomerName());
    vikram.setAccNum(100);
        System.out.println("Account Number="+vikram.getAccNum());
    vikram.setEmail("vikrambhati780@gmail.com");
        System.out.println("Email="+vikram.getEmail());
        vikram.setMobNum("9074006569");
        System.out.println("MobNo="+ vikram.getMobNum());
    vikram.setBal(10000);
        System.out.println("current Balance="+vikram.getBal());
    vikram.deposit(10000);
    vikram.withdraw(5000);
        System.out.println("Final Bal="+vikram.getBal());
    vikram.withdraw(50000);
        System.out.println("bal="+vikram.getBal());
    }*/
    vipAcc vikram=new vipAcc();
        System.out.println(vikram.getCreditLimit());
        System.out.println(vikram.getEmail());
        System.out.println(vikram.getName());
    vipAcc v=new vipAcc("allahu","2","ktb@gmail.com");
        System.out.println(v.getCreditLimit());
        System.out.println(v.getEmail());
        System.out.println(v.getName());
    vipAcc va=new vipAcc("allahu","80");
        System.out.println(va.getCreditLimit());
        System.out.println(va.getEmail());
        System.out.println(va.getName());

    }}
