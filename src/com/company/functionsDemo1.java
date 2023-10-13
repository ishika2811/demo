package com.company;


import java.util.Scanner;


 class functionsDemo1
 {

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



     */
     int a,b,c;
    void input(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        a=s.nextInt();
        b=s.nextInt();
    }
    void add(){
        c=a+b;
        System.out.println(c);
    }
    static void greet(){ //function definiton

        System.out.println("Hello");
    }

    public static void main(String[] args) {
functionsDemo1 fd=new functionsDemo1();//object creation
fd.input();//function calling instance
fd.add();
greet();//function calling static
    }
}
