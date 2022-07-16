package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Point of x1 ");
        int x1 = sc.nextInt();
        System.out.println("Enter a Point of y1");
        int y1=sc.nextInt();
        System.out.println("Enter a Point of x2");
        int x2= sc.nextInt();
        System.out.println("Enter a Point of y2");
        int y2= sc.nextInt();

        Double Length=Math.sqrt(Math.pow((x2-x1),2))+(Math.pow((y2-y1),2));
        System.out.println("Length of Line is "+Length);
    }
}
