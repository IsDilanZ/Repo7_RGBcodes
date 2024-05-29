package com.example.repo7_rgbcodes;
import java.util.Scanner;


public class HelloApplication {
    public static int AsignedRed;
    public static int AsignedGreen;
    public static int AsignedBlue;
    public static void main(String[] args) {
        Red();
        Green();
        Blue();

        System.out.println("Your RGB code is => #" + AsignedRed + "" + AsignedGreen + "" + AsignedBlue);
    }

    private static void Red() {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter Code for R value");
        int R = inputValue.nextInt();
        if ((R >= 40 && R<80) || (R > 120 && R < 140)){
            AsignedRed = R;
            System.out.println("Variable R saved successfully ->" + AsignedRed);
        } else {
            System.out.println("Error - only values between 40 - 79 or 120 - 140 are allowed");
            Red();
        }
    }

    private static void Green() {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter Code for G value");
        int G = inputValue.nextInt();
        if (G < 30 && G >= 0){
            AsignedGreen = G;
            System.out.println("Variable G saved successfully ->" + AsignedGreen);
        } else {
            System.out.println("Error - only values between 0 - 29 are allowed");
            Green();
        }
    }

    private static void Blue() {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter Code for B value");
        int B = inputValue.nextInt();
        if (B < 20 && B > -1){
            AsignedBlue = B;
            System.out.println("Variable B saved successfully ->" + AsignedBlue);
        } else {
            System.out.println("Error - only values between -1 - 20 are allowed");
            Blue();
        }
    }
}