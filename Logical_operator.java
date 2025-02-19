package com.company;

public class Logical_operator
{
    public static void main(String[] args) {
        System.out.println("For Logical AND>>");
        boolean a = true;
        boolean b = false;
        if (a || b) {
            System.out.println("N");

        } else {
            System.out.println("Y");
        }

        System.out.println("For Logical OR>>");
        boolean p = true;
        boolean q = false;
        if (p && q) {
            System.out.println("N");
        } else {
            System.out.println("Y");
        }
        System.out.println("For Logical NOT");
        System.out.print("NOT(a) is ");
        System.out.println(!a);
        System.out.print("NOT(b) is ");
        System.out.println(!b);
    }
}
