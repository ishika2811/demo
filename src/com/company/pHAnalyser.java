package com.company;

import java.util.Scanner;

class pHAnalyser {
     public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the pH value:");

         int pH=s.nextInt();
         if(pH<7){
             System.out.println("pH value is low,partial water changes required");

         }
         if(pH>=7&&pH<=8){

             System.out.println("pH value is fine");

         }
         else if (pH>8){

             System.out.println("pH value is high,partial water changes required");
         }

     }
}
