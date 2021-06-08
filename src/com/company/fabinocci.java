package com.company;
import java.util.Scanner;

public class fabinocci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int j=s.nextInt();
        System.out.println("fabinocci series is:");
        System.out.print(a+" ");
        System.out.print(b+" ");
        //fabinocci x=new fabinocci();
        for(int i=0;i<j;i++) {
            int k=fac(a,b);
            System.out.print(k+" ");
            a=b;
            b=k;
        }
        s.close();
    }
    static  int fac(int a,int b) {
        int c;
        c = a+b;
        return c;
    }

}
