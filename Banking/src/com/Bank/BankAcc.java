package com.Bank;

public class BankAcc {
    private int accNum,bal;
    private String mobNum;
    private String customerName,email;

    public void setAccNum(int accNum){
        this.accNum=accNum;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public void setMobNum(String mobNum) {
        this.mobNum = mobNum;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccNum() {
        return this.accNum;
    }

    public int getBal() {
        return this.bal;
    }

    public String getMobNum() {
        return this.mobNum;
    }
    public String getEmail() {
        return this.email;
    }

    public String getCustomerName() {
        return this.customerName;
    }
    public void deposit(int num){
        this.bal+=num;
        System.out.println("Balance updated="+this.bal +"Amount credited="+num);
    }
    public void withdraw(int num){
        if(num<=this.bal){
             this.bal-=num;
            System.out.println("Amount="+num+"is Withdrawn Updated Bal"+this.bal);
        }
        else {
            System.out.println("Insufficient Balance Cannot withdraw");
        }
    }

}
