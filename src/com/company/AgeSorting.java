package com.company;

public class AgeSorting {

    int[]getSorted (int []ageArray){
        for(int i=0;i<ageArray.length;i++){
            for(int j=0;j<ageArray.length-i-1;j++){

               if ( ageArray[j]<ageArray[j+1]){
                   int temp=ageArray[i];
                   ageArray[j]=ageArray[j+1];
                   ageArray[j+1]=temp;




               }
            }
        }
        return ageArray;

    }

    public static void main(String[] args) {
        int ageArray1[]={34,56,87,50,97};
        System.out.println("Unsorted Age:");
        for(int a:ageArray1){
            System.out.println(a);
            AgeSorting a2= new AgeSorting();

           int ageArry2[]=a2.getSorted(ageArray1);
            System.out.println("Sorted Age:");

            for(int b:ageArry2){
                System.out.println(b);
            }







        }

    }





}
