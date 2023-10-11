package com.company;

public class exception {
    public static void displayExeception(){
        System.out.println("ERROR");
        int arr[]=new int[4];
        try {
            for (int i = 0; i < 6; i++) {

                System.out.println(arr[i]);

            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceptyion"+exception);

        }
    }


    public static void main(String[] args) {
    exception.displayExeception();
        System.out.println();
    }


}
