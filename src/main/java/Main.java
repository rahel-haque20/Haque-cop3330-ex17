/*
* UCF COP3330 Fall 2021 Assignment 17 Solution
* Copyright 2021 Rahel Haque
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner BAC = new Scanner(System.in);
        System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
        int g = BAC.nextInt();
        System.out.println("How many ounces of alcohol did you have? ");
        int a = BAC.nextInt();
        System.out.println("What is your weight, in pounds? ");
        int lbs = BAC.nextInt();
        System.out.println("How many hours has it been since your last drink? ");
        int h = BAC.nextInt();

        double r = (g==1) ? 0.73 : 0.66;

        double test = (a * 5.14 / lbs * r) - 0.015 * h;
        if(test<=0.08)
            System.out.printf("Your BAC is %f%nIt is legal for you to drive.", test);

        else
            System.out.printf("Your BAC is %f%nIt is not legal for you to drive.", test);
    }
}