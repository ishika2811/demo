package com.company;

public class AverageAgefile {


    public String averageAgeCalculator(String[] ageRawData) {
        int sum = 0;
        int count = 0;

        for (String age : ageRawData) {
            try {
                sum += Integer.parseInt(age);
                count++;
            } catch (java.lang.NumberFormatException e) {
                return "java.lang.NumberFormatException: For input string: \"" + age + "\"";
            }
        }

        double averageAge = (double) sum / count;
        return String.format("Average Age - %.2f", averageAge);
    }


    public static void main(String[] args) {
String age[]={"34","26","32","44"};
AverageAgefile a=new AverageAgefile();


    }
}