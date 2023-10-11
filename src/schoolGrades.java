import java.util.Scanner;

 class schoolGrades {
    int total = 0, average = 0, i;
int marks;
    int totalMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects");
        for (i = 1; i <= 5; i++) ;
        {

            marks = sc.nextInt();
            total += marks;

        }
        return total;

    }
    int averageMarks(int total) {
        average = total / 5;
        return average;

    }

    public static void main(String[] args) {
         schoolGrades sg=new schoolGrades();
         int total= sg.totalMarks();
        System.out.println("Total marks:"+total);
        int average= sg.averageMarks(total);
        System.out.println("Average marks :"+average);
    }


    }

