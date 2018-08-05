package com.vikram;

public class InchToCm {
    public static void main(String[] args) {
        calFeetAndInchToCm(7,5);
    }

    public static int calFeetAndInchToCm(double feet,double inch){
        if (feet>=0 && (inch>=0&&inch<=12)){
            double feetToCm=feet/0.032808;
            double inchToCm=inch/0.39370;
            System.out.println("feetToCm="+feetToCm
            +"inchToCm="+inchToCm);
            return 0;
        }
        return -1;

    }
    public static int calFeetAndInchToCm(double inch){
        if (inch>=0){
            double inchToFeet=inch*0.083333;
            System.out.println("inchToFeet="+inchToFeet);
            return 0;
        }
        return -1;

    }
}
