package com.bidgelabz.employeewage;

public class EmployeeWage {
    static final int IS_FULL_TIME=1;
    static final int IS_PART_TIME=2;
    static final int WAGE_PER_HR=20;
    static final int FULL_DAY_HR=10;
    static final int PART_TIME_HR=5;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage !");
        double empCheck=Math.floor(Math.random()*10) % 3;
        int dailywage=0;
        if(empCheck==IS_FULL_TIME) {
            System.out.println("employee is full time");
            dailywage=WAGE_PER_HR * FULL_DAY_HR;
        } else if (empCheck==IS_PART_TIME) {
            System.out.println("employee is part time");
            dailywage=WAGE_PER_HR * PART_TIME_HR;
        }
        else {
            System.out.println("employee is absent");
        }
        System.out.println("Daily Wage is "+dailywage);
    }
}


