package TA;

public class P7 {
    public static void main(String[] args) {
        int a=10, b=20, c=30, x=0;
        if(a>b && a>c)
        {
            x=a;
        } else if (b>a && b>c) {
            x=b;
        }
        else{
            x=c;
        }
        System.out.println("largest number is : "+x);
    }
}
