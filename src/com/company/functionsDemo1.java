package com.company;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class functionsDemo1 {

    /*9static void display() {
        System.out.println("Happy Learning");
    }

    public static void main(String[] args) {

        display();
    }


    public int AreaCalculator(int length,int breadth){
        int area=length*breadth;
        return area;

    }

    public static void main(String[] args) {
        functionsDemo1 fd=new functionsDemo1();
       int area= fd.AreaCalculator(34,56);
        System.out.println(area);

    }

     */
    int totalMarks = 0;
    int averageMarks = 0;
    int marks;

    int TotalMarks() {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            marks = s.nextInt();

            totalMarks = +marks;
        }
        return totalMarks;

    }

    int AverageMarks(int totalMarks) {
        averageMarks = totalMarks / 5;
        return averageMarks;
    }

    public static void main(String[] args) {


        functionsDemo1 fd = new functionsDemo1();
        int total = fd.TotalMarks();
        System.out.println(total);
int average=fd.AverageMarks(total);
        System.out.println(average);

    }


}
