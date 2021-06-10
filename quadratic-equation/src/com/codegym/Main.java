package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();
        String result = "";
        if (delta > 0) {
            result = "two roots " + root1 + " and " + root2;
        } else if (delta == 0) {
            result = "one root " + root1;
        } else {
            result = "no real roots";
        }
        System.out.println("The equation has " + result);
    }
}
