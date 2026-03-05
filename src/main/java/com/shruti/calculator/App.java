package com.shruti.calculator;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Calculator calc = new Calculator();
        Scanner sc  = new Scanner(System.in);

        while(true){
            System.out.println("Scientific Calculator");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            try {
                switch(choice){
                    case 1:
                        System.out.println("Enter the number");
                        double num = sc.nextDouble();
                        System.out.println("Square root of " + num + " is " + calc.sqrt(num));
                        break;
                    case 2:
                        System.out.println("Enter the number");
                        int num2 = sc.nextInt();
                        System.out.println("Factorial of " + num2 + " is " + calc.factorial(num2));
                        break;
                    case 3:
                        System.out.println("Enter the number");
                        double num3 = sc.nextDouble();
                        System.out.println("Natural log of " + num3 + " is " + calc.naturalLog(num3));
                        break;
                    case 4:
                        System.out.println("Enter the base");
                        double base = sc.nextDouble();
                        System.out.println("Enter the power");
                        double power = sc.nextDouble();
                        System.out.println("Power of " + base + " to the power " + power + " is " + calc.power(base, power));
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }catch(Exception e){
                System.out.println("Error" + e.getMessage());
            }

        }
    }
}

