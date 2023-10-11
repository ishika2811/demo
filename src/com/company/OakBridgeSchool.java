package com.company;



    public class OakBridgeSchool {
        public int[] calculateTotalMarks(int[] math, int[] science, int[] english) {
            int[] totalMarks = new int[math.length];
            for (int i = 0; i < math.length; i++) {
                totalMarks[i] = math[i] + science[i] + english[i];
            }
            return totalMarks;
        }

        public int[] calculateTotalAverageMarksForEachStudent(int[] totalMarks, int noOfSubjects) {
            int[] averageMarks = new int[totalMarks.length];
            for (int i = 0; i < totalMarks.length; i++) {
                averageMarks[i] = totalMarks[i] / noOfSubjects;
            }
            return averageMarks;
        }

        public int calculateAverageScienceMarks(int[] science) {
            int sum = 0;
            for (int mark : science) {
                sum += mark;
            }
            return sum / science.length;
        }

        public int calculateAverageEnglishMarks(int[] english) {
            int sum = 0;
            for (int mark : english) {
                sum += mark;
            }
            return sum / english.length;
        }
        int sum = 0;

        public int calculateAverageMathMarks(int[] math) {
            for (int mark : math) {
                sum += mark;
            }
            return sum / math.length;
        }

        public static void main(String[] args) {

            OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();

            int[] math = {80, 90, 70, 60, 75, 85, 95, 65, 55, 50};
            int[] science = {90, 85, 75, 65, 80, 95, 70, 60, 50, 55};
            int[] english = {85, 80, 90, 70, 75, 95, 65, 55, 60, 50};
            int noOfSubjects = 3;

            String[] studentNames = {"Ishika", "Babu", "Shraddha", "Shiv", "David", "Sarah", "Duggu", "Kashish", "Peter", "Dinesh"};
            int[] rollNos = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
            int[] totalMarks = oakBridgeSchool.calculateTotalMarks(math, science, english);
            int[] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks, noOfSubjects);

            System.out.println("Roll No\tName\tMath\tScience\tEnglish\tTotal\tAverage");
            for (int i = 0; i < studentNames.length; i++) {
                System.out.println(rollNos[i] + "\t" + studentNames[i] + "\t" + math[i] + "\t" + science[i] + "\t" +
                        english[i] + "\t" + totalMarks[i] + "\t" + averageMarks);




            }
        }
    }


