package com.company;

import java.util.Scanner;

class FurnitureItem {
    String gradeofFurniture, colour, Furnitureusage, Furnituretype, indoor;
    int furnitureCode;
    float price;

    Scanner sc = new Scanner(System.in);

    public FurnitureItem() {
        colour = sc.next();
        gradeofFurniture = sc.next();
        Furnitureusage = sc.next();
        Furnituretype = sc.next();
        furnitureCode = sc.nextInt();
        price = sc.nextFloat();


                }


        public void displayDetails ()
        {
            System.out.println("Furniture Grade:"+gradeofFurniture);
            System.out.println("Furniture Colour:"+colour);
            System.out.println("Furniture usage(Indoor/Outdoor):"+Furnitureusage);
            System.out.println("Furniture Type:"+Furnituretype);
            System.out.println("Furniture Code:"+furnitureCode);
            System.out.println("Price:"+price);

        }
public void discount()
{


}

        double discount ( float discountPercentage, float price){

        return price - (price * discountPercentage / 100);
    }

    }

    public class FurnitureItemImpl {
        public static void main(String[] args) {
            FurnitureItem furnitureItem = new FurnitureItem();
            furnitureItem.displayDetails();
            furnitureItem.discount();
            double discount=furnitureItem.discount(5, furnitureItem.price);

            System.out.println("Discounted price" +discount);
        }
    }

