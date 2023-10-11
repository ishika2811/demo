package com.company;

import java.util.Scanner;

 class functionDemo2 {

    int a,b,c;


void input(){
    Scanner S=new Scanner(System.in);
    System.out.println("Enter the number:");
     a=S.nextInt();
     b=S.nextInt();

}
void add(){
   c=a+b;
    System.out.println(c);

}

    public static void main(String[] args) {
        int a,b,c;
        functionDemo2 f=new functionDemo2();
        f.input();
        f.add();

    }




}
