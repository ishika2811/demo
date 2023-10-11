package com.company;

import java.util.Scanner;

class implementaionModular {
 /* public int Calculatearea(int lenght,int breadth){
  int area=lenght*breadth;
  return area;

  }

  public static void main(String[] args) {
   implementaionModular m=new implementaionModular();
   int area=m.Calculatearea(10,20);
      System.out.println(area);

  }


    public void display(){
        System.out.println("Hello");
        return;

    }

    public static void main(String[] args) {
        implementaionModular m=new implementaionModular();
m.display();
    }

  */
    int totalMarks=0,averageMarks=0,i,marks;
    int TotalMarks(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks");
        for
        (i=0;i<=5;i++){
            marks=s.nextInt();
        }
        totalMarks=+marks;
        return totalMarks;


    }

int AverageMarks=0;
    int averagemarks(int total){
        AverageMarks=total/5;
        return AverageMarks;
    }

    public static void main(String[] args) {
        implementaionModular m=new implementaionModular();
        int total=m.totalMarks;
        System.out.println(total);
        int average=m.AverageMarks;

    }
}

