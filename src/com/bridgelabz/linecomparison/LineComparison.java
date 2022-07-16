package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Line Points :");
        System.out.println("Enter a Point of x1 ");
        int x1 = sc.nextInt();
        System.out.println("Enter a Point of y1");
        int y1=sc.nextInt();
        System.out.println("Enter a Point of x2");
        int x2= sc.nextInt();
        System.out.println("Enter a Point of y2");
        int y2= sc.nextInt();

        Double length1=Math.sqrt(Math.pow((x2-x1),2))+(Math.pow((y2-y1),2));
        System.out.println("Length of Line is "+length1);
        System.out.println();

        System.out.println("Enter Second Line Points :");
        System.out.println("Enter a Point of x3 ");
        int x3 = sc.nextInt();
        System.out.println("Enter a Point of y3");
        int y3=sc.nextInt();
        System.out.println("Enter a Point of x4");
        int x4= sc.nextInt();
        System.out.println("Enter a Point of y4");
        int y4= sc.nextInt();

        Double length2=Math.sqrt(Math.pow((x4-x3),2))+(Math.pow((y4-y3),2));
        System.out.println("Length of Line is "+length2);

        boolean result=length1.equals(length2);
        if(result==true){
            System.out.println("Both Lines are Equal!");
        }
        else {
            System.out.println("Lines are Not Equal!");
        }
    }
}
