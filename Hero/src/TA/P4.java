package TA;

public class P4 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30, max;
        max = (a>b) ? (a>c ? a:c):(b>c ? b:c);
        System.out.println("maximum value:"+max);
    }
}
