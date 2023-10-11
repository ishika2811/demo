package com.company;

import java.util.Scanner;

class Area {
     public static void main(String[] args) {
         System.out.println("Side or Lenght and breath:");

         Scanner s=new Scanner(System.in);

         System.out.println("Choose the area:");
         System.out.println("1.Area of the square");
         System.out.println("2.Area of the circle");
         System.out.println("3.Area of the rectangle");
         System.out.println("Choose(1/2/3)");
         int choose=s.nextInt();
         double Area = 0;
         
         switch (choose){
             case(1):

             System.out.println("Enter the side of the square:");
             int side=s.nextInt();
                 Area=side*side;
                 break;
             case (2):
                 System.out.println("Enter the radius of the circle:");
                 int radius=s.nextInt();
                 Area=2*3.14*radius;
break;
             case (3):
                 System.out.println("Enter the lenght and Breadth of the rectangle:");
                 int length=s.nextInt();
                 int breadth=s.nextInt();
                 Area=length*breadth;
                 break;
             default:
                 System.out.println("Invalid Data");
         }
         System.out.println("Area"+Area);
     }
}
