package com.mycompany.practical_03;

public class Practical_03 {
    public static void main(String[] args) {
        Employee emp = new Employee("Bogdan", 50000.0, 10000.0);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("Bonus Amount: " + emp.calculateBonusAmount());
    }
}


/*
This code will print the following output:

Employee Name: Bogdan
Basic Salary: 50000.0
Bonus: 10000.0
Bonus Amount: 60000.0

*/
