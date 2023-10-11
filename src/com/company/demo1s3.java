package com.company;

import java.util.Scanner;

class books{
    String title,authorName;
    int year ;
    int ISBNnumber;
    Scanner sc=new Scanner(System.in);

    void input (){
        System.out.println("ENTER TITLE");
        title=sc.next();
        System.out.println("AUTHOR NAME");
        authorName=sc.next();
        System.out.println("ISBN");
        ISBNnumber=sc.nextInt();
        System.out.println("YEAR");
        year=sc.nextInt();

    }
    void display()
    {
        System.out.println(title);
        System.out.println(authorName);
        System.out.println(ISBNnumber);
        System.out.println(year);
    }
 }
public class demo1s3 {
    public static void main(String[] args) {
        books b=new books();
        b.input();
        b.display();

    }
}
