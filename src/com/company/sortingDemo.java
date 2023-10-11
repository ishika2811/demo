package com.company;

public class sortingDemo {

    int[] sorting(int rollNo[]) {

        for (int i = 0; i < rollNo.length; i++) {
            for (int j = 0; j < rollNo.length - i - 1; j++) {
                if (rollNo[j] < rollNo[j + 1]) {
                    int temp = rollNo[i];
                    rollNo[j] = rollNo[j + 1];
                    rollNo[j + 1] = temp;

                }
            }
        }
        return rollNo;

    }

    public static void main(String[] args) {
        int rollNo1[] = {104, 205, 101, 302, 110, 47, 67, 2354, 567, 12};

        System.out.println("UNSORTED ROLL NO:");
        for (int b : rollNo1) {
            System.out.println(b);

        }
        sortingDemo d = new sortingDemo();
        int rollNo2[] = d.sorting(rollNo1);

        System.out.println("SORTED ROLL NO:");
        for (int a : rollNo2) {
            System.out.println(a);

        }

    }
}








