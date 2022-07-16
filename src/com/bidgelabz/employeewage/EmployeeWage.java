package com.bidgelabz.employeewage;

public class EmployeeWage {
    static final int Employee_Present=1;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Program!");
        double empCheck=Math.floor(Math.random()*10) % 2;
        if(empCheck==Employee_Present)
            System.out.println("employee is present");
        else
            System.out.println("employee is absent");

    }
}
