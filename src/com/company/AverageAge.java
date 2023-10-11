package com.company;

public class AverageAge {


    public String averageAgeCalculator(String[] ageRawData) {
        int sum = 0;
        int count = 0;
        for (String ageString : ageRawData) {
            try {
                int age = Integer.parseInt(ageString);
                sum += age;
                count++;
            } catch (java.lang.NumberFormatException e) {
                return "java.lang.NumberFormatException: For input string: \"" + ageString + "\"";
            }
        }
        if (count == 0) {
            return "No valid age data provided.";
        }
        double averageAge = (double) sum / count;
        return "Average Age - " + String.format("%.2f", averageAge);
    }


    public static void main(String[] args) {

    }
}


