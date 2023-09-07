package TA;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        System.out.println( "enter the value a, b, c \n i will give you maximum value. ");
        Scanner a = new Scanner(System.in);
        int var1 = a.nextInt();
        int var2 = a.nextInt();
        int var3 = a.nextInt();
//        int x=0;

        System.out.println("your input is: "+var1+" "+var2+" "+var3);

        if (var1>var2 && var1>var3){
            System.out.println("Variable 1 is largest");
//            x=var1;
        }
        if (var2>var1 && var2>var3){
            System.out.println("variable 2 is largest");
//            x=var2;
        }
        if (var3>var1 && var3>var2){
            System.out.println("variable 3 is largest");
//            x=var3;
        }
        else{
            System.out.println("Please enter a valid number");
        }
//        System.out.println("largest number is "+ x);
    }
}
