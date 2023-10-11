package com.company;

import java.util.Scanner;
 class Calculator {

     public static void main(String[] args) {

         Scanner s = new Scanner(System.in);
         System.out.println("Enter the number 1:");
         double num1 = s.nextDouble();
         System.out.println("Enter the number 2:");
         double num2 = s.nextDouble();
         System.out.println("Enter the number for operation:");
         System.out.println("1.Addtion");
         System.out.println("2.Subtraction");
         System.out.println("3.Multiplication");
         System.out.println("4.Division");
         System.out.println("Enter the chioce(1/2/3/4)");
         int choice = s.nextInt();
         double result = 0;

         switch (choice) {

             case (1):
                 result = num1 + num2;
                 break;

             case (2):
                 result = num1 - num2;
                 break;
             case (3):
                 result = num1 * num2;
                 break;
             case (4):

                 result = (num1 / num2);
                 break;

             default:
                 System.out.println("Invalid Choice");



         }
         System.out.println("Result:"+result);

     }
}
