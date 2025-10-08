package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        Calculator Sihang = new Calculator("Sihang");
        //2. call any methods of that class to test
        double operation = Sihang.performOperation("*", 1, 3);
        System.out.println(operation);
    }
}
