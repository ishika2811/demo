package com.company;


import java.util.Scanner;

class table {
    String size, colour;
    float price;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("TABLE");
        size = sc.next();
        colour = sc.next();
        price = sc.nextFloat();

    }

    void display() {
        System.out.println(size + " " + colour + " " + price + " ");
    }
}
    class chair {
        float price;
        String colour, size;

        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.println("CHAIR");
            size = sc.next();
            colour = sc.next();
            price = sc.nextFloat();
        }

        void display() {
            System.out.println(size + " " + colour + " " + price + " ");
        }
    }
class cupboard {
    float price;
    String colour, size;

    void input() {
        Scanner sc = new Scanner(System.in);
        size = sc.next();
        colour = sc.next();
        price = sc.nextFloat();
    }

    void display() {
        System.out.println(size + " " + colour + " " + price + " ");
    }



        double discount(float discoutPercentage, float price) {
            return price - (price * discoutPercentage / 100);
        }


}

    public class furniture {

        public static void main(String[] args) {
            table t = new table();
chair c=new chair();
c.input();
c.display();


            t.input();
            t.display();
cupboard c1=new cupboard();
c1.input();
c1.display();
double discount=c1.discount(5, c1.price);


            System.out.println("Discounted price" + discount);
        }
    }


