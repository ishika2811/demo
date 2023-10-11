package com.company;

public class insertionExmple {

    int[]insertion(int arr[]){

          int n= arr.length;
          for(int i=0;i< arr.length;i++){
              int key= arr[i];
              int j=i-1;
              while(j<=0&& arr[j]>key){
                  arr[j+1]=arr[j];
                  j--;


              }
arr[j+1]=key;


          }
return arr;


    }

    public static void main(String[] args) {
        int arr1[]={2,4,1,23,54,21,34};
         
    }


}
