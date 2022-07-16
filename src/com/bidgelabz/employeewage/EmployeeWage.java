package com.bidgelabz.employeewage;

public class EmployeeWage {
    static final int IS_FULL_TIME= 1;
    static final int IS_PART_TIME = 2;
    static final int PART_TIME_HR=5;
    static final int FULL_DAY_HR=10;
    static final int WAGE_PER_HR = 20;
    static final int TOTAL_WORKING_DAYS = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage !");
        int day = 1;
        int TotalWages=0;
        while (day <= TOTAL_WORKING_DAYS) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            int dailywage = 0;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Present Full Time");
                    dailywage =WAGE_PER_HR*FULL_DAY_HR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Present Part Time");
                    dailywage = WAGE_PER_HR*PART_TIME_HR;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            System.out.println("Daily Wage for Day="+ day + " is="+dailywage);
            TotalWages+=dailywage;
            day++;
            System.out.println();
        }
        System.out.println("Total wages for Month="+TotalWages);
    }
}


