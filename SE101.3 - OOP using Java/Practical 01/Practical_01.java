package com.mycompany.practical_01;

public class Practical_01 {

    public static void main(String[] args) {
        // 1.	Write you first java programme to display “Hello World” on the screen.
        System.out.println("Hello World!");
        // Q. 02
        System.out.println("My name is Thuvaragan");
        System.out.println("I am following BSc Hons in Computer Science Degree");
        // Q. 03 (for loop)
        for (int i = 0; i < 5; i++) {
            System.out.println("Executing Loop " + i);
        }
        // Q. 03 (while loop)
        int i = 0;
        while (i < 5) {
            System.out.println("Executing Loop " + i);
            i++;
        }
        // Q. 04
        int[] numArray = {10, 20, 30, 40, 50};
        for (int x : numArray) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
            System.out.println("\n");
        }
		/*
		result:
		10
		20
		I'm out of the loop now
		*/

		int[] numArray = {10, 20, 30, 40, 50};
        for (int x : numArray) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
            System.out.println("\n");
        }
		/*
		result:
		10
		20
		40
		50
		I'm out of the loop now
		*/
        System.out.println("I'm out of the loop now");

        // Q. 05
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
		/* output:
		Excellent
		*/
		char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
		/* output:
		Excellent
		You passed
		*/

        // Q. 06
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println();
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
    }
}
