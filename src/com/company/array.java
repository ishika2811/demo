package com.company;

public class array {
    public static void main(String[] args) {
      /*  int age[]=new int[5];
        age[0]=32;
        age[1]=24;
        age[2]=34;
        age[3]=43;
        age[4]=21;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[4]);


       int age[]={23,43,13,34};
        System.out.println(age[2]);



       String name[]={"ishu","babu"};
       for
            ( String elements:name){
           System.out.println(elements);

        }



        int number[]={23,34,56,21,19,30};
        int sum=0;
        for(int i=0;i<number.length;i++){
            if (number[i]%2==0){
                sum=sum+number[i];
                System.out.println(sum);
            }


        }
       */
        int numbers[] = {23,34,56,67,12,45,56,45,67,66};
        int sum=0;

        for (int i=0;i<numbers.length;i++){
            if(numbers[i] %2==0){
                sum = sum+numbers[i];
            }
        }
        System.out.println("Sum of even numbers" + sum);


    }
}
