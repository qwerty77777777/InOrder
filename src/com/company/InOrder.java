package com.company;

import java.util.Scanner;

public class InOrder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(); int b=in.nextInt(); int c=in.nextInt();
        if (a<b && b<c)
            System.out.println(a+" "+b+" "+c);
        if (b<a && a<c)
            System.out.println(b+" "+a+" "+c);
        if (b<c && b<a && c<a)
            System.out.println(b+" "+c+" "+a);
        if (a<c && a<b && c<b)
            System.out.println(a+" "+c+" "+b);
        if (c<a && c<b && a<b)
            System.out.println(c+" "+a+" "+b);
        if (c<b && b<a)
            System.out.println(c+" "+b+" "+a);
    }
}
