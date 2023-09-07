package TA;

import java.awt.*;
import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        System.out.println("enter you marks, i will tell your grade");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

//        System.out.println("your marks is "+ marks);
        String grade = null;

        if (marks<=100 && marks>=90)
        {
            grade="A";
        }
        else if (marks>=80 && marks<=89){
            grade="B";
        }
        else if (marks>=70 && marks<=79){
            grade="C";
        }
        else if ( marks>=0 && marks<=69) {
            grade="F";
        }
        else {
            System.out.println("your marks is invalid");
        }
        System.out.println("your grade is "+ grade);
    }
}
