package com.company;

public class NumberFormatException {

    public static void main(String[] args) {


        String string1 = "Ishika";
        try {
            int data = Integer.parseInt(string1);

        } catch (java.lang.NumberFormatException exception) {
            System.out.println("exception"+exception);
        }
    }
}