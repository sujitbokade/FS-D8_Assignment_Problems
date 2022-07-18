package com.bidgelabz.employeewage;

public class EmployeeWage {
        static final int IS_FULL_TIME = 1;
        static final int IS_PART_TIME = 2;
        static final int WAGE_PER_HOUR = 20;
        static final int WORKING_DAY_PER_MONTH = 20;
        static final int TOTAL_WORK_HOURS = 100;


        static void calculateWage(){

            int empHr;
            int totalHour=0;
            int dailyWage;
            int day=0;
            int totalWage=0;

            while((totalHour<TOTAL_WORK_HOURS) && (day<WORKING_DAY_PER_MONTH)) {

                int attendance = (int)(Math.floor(Math.random()*10))%3;
                switch (attendance) {
                    case IS_FULL_TIME:
                        empHr=10;
                        break;
                    case IS_PART_TIME:
                        empHr=5;
                        break;
                    default:
                        empHr=0;
                        break;
                }
                totalHour+=empHr;
                dailyWage = WAGE_PER_HOUR*empHr;
                totalWage+=dailyWage;
                day++;
                System.out.println("Day "+day+" Emp work hour "+empHr+ " wage is "+dailyWage);
            }
            System.out.println("Total work hours is : "+totalHour);
            System.out.println("Total work days are: " +day);
            System.out.println("Total wage is: "+totalWage);

        }

        public static void main(String[] args) {
            calculateWage();
        }

    }
