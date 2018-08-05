package com.vikram;

public class switchTest {
    public static void main(String[] args) {

        int a[]={2,4,6,8,10,12,13,19,15};
        for (int i=0;i<a.length;i++){
        if(isEven(a[i])){
            System.out.println(a[i]+"is even");
        }
        else {
            System.out.println(a[i]+"is ODD");
        }
        }

        }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
    }

