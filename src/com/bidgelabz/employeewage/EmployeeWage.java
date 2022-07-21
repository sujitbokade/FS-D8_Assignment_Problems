package com.bidgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        EmployeeWageBuilder pharandespaces = new EmployeeWageBuilder("Pharande Spaces", 10, 20, 100);
        EmployeeWageBuilder hassantechnology = new EmployeeWageBuilder("Hassan Technology", 20, 22, 90);
        hassantechnology.calculateWage();
        System.out.println(hassantechnology);
        pharandespaces.calculateWage();
        System.out.println(pharandespaces);

    }

}