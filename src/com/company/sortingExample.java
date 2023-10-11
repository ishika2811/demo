package com.company;

public class sortingExample {
    int[] sortngExample(int array[]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }

        }
        return array;
    }

    public static void main(String[] args) {
        int array1[] = {2, 34, 13, 54, 65};

        System.out.println("Unsorted Array");
        for (int b : array1) {
            System.out.println(b);
        }
            sortingExample s = new sortingExample();
            int array2[] = s.sortngExample(array1);
            System.out.println("Sorted Array");
            for (int a : array2) {
                System.out.println(a);
            }

        }
    }

