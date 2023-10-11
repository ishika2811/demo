package com.company;

public class Example {

    public static void main(String[] args) {
        String[] array = {"Hello", "Welcome", "World"};
        String[] strArray = {"World", "Home", "Class"};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                System.out.println(array[i]+" : "+strArray[j]+" : ");

            }
            System.out.println();
        }

    }
}
