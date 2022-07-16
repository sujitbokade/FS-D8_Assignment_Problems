package com.bridgelabz.linecomparison;

import java.util.Scanner;
class Point{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void getPoint(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Point x");
        setX(scr.nextInt());
        System.out.println("Enter Point y");
        setY(scr.nextInt());


    }

    Double legth(int x1,int y1,int x2,int y2){
          Double result= Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
          return result;
      }
}

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program!");
        Scanner sc = new Scanner(System.in);

         Point point1=new Point();
         Point point2=new Point();
         Point line1 =new Point();
         Point line2 =new Point();

        System.out.println("Enter First Line Points :");
         point1.getPoint();
         point2.getPoint();

         Double length1=line1.legth(point1.getX(), point1.getY(), point2.getX(),point2.getY());
         System.out.println("Length of  First Line is "+length1);
         System.out.println();


         System.out.println("Enter Second Line Points :");
         point1.getPoint();
         point2.getPoint();

         Double length2=line1.legth(point1.getX(), point1.getY(), point2.getX(), point2.getY());
         System.out.println("Length of Second Line is "+length2);

         if(length1.equals(length2)){
             System.out.println("Both are Equal Lines!");
         }else if (length1.compareTo(length2)>0){
             System.out.println("Length of 1st Line is Greater than 2nd Line");
         }else if(length1.compareTo(length2)<0){
             System.out.println("Length of 2nd Line is Greater than 1st Line");

        }


    }
}