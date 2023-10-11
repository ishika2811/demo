package com.company;

public class GameDemo {



        public String divideByNumber(int firstNumber, int secondNumber) {
            try {
                int remainder = firstNumber % secondNumber;
                return Integer.toString(remainder);
            } catch (ArithmeticException e) {
                return e.toString();
            }
        }

        public static void main(String[] args) {
            int firstNumber = 10;
            int secondNumber = 5;
            GameDemo game = new GameDemo();
            String remainder = game.divideByNumber(firstNumber, secondNumber);
            System.out.println(remainder); // Output: 0

            firstNumber = 10;
            secondNumber = 0;
            remainder = game.divideByNumber(firstNumber, secondNumber);
            System.out.println(remainder); // Output: java.lang.ArithmeticException: / by zero
        }
    }

