package com.bidgelabz.employeewage;

public class EmployeeWage {
    static final int Employee_Present=1;
    static final int Wage_per_Hr=20;
    static final int Full_Day_Hr=10;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage !");
        double empCheck=Math.floor(Math.random()*10) % 2;

        int dailywage=0;
        if(empCheck==Employee_Present) {
            System.out.println("employee is present");
            dailywage=Wage_per_Hr*Full_Day_Hr;
        }
        else {
            System.out.println("employee is absent");
        }
        System.out.println("Daily Wage is "+dailywage);
    }
}


