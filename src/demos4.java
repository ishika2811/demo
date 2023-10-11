import java.util.Scanner;

public class demos4 {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        do {
            num = sc.nextInt();
            sum =  sum+ num;
            System.out.println("sum of the number :"+sum);
        } while(sum<=999);

        }


    }

