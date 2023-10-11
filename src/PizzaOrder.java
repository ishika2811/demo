 class PizzaOrder {
     public static void main(String[] args) {
         String coustmerName,Address,email;
         int numberOfPizza,numberOfGarlicBread,numberOfBeverages;
         coustmerName="Gary";
         Address="20,Marine Drive,Eville";
         email="gary123@gmail.com";
         long phoneNumber=412312345;
         numberOfPizza=5;
         float pizzaPrice=12.5f;
         char pizzaSize='M';
         numberOfGarlicBread=3;
         numberOfBeverages=3;
         float garlicbreadPrice=5.99f;
         float beveragesPrice=1.99f;
float TotalPrice=(numberOfPizza*pizzaPrice+numberOfGarlicBread*garlicbreadPrice+numberOfBeverages*beveragesPrice);


Boolean isGreater;
if(TotalPrice==100){

}
float discount=TotalPrice*10/100;

         System.out.println("------------------------------------------------------");
                  System.out.println("               Coustmer Details                       ");

         System.out.println("------------------------------------------------------");
         System.out.println("  Coustmer Name:"+coustmerName);
         System.out.println("  Coustmer Phone Numner:"+phoneNumber);
         System.out.println("  Coustmer email:"+email);
         System.out.println("  Coustmer Address:"+Address);
         System.out.println(


                                                                                   );
         System.out.println("----------------------------------");

         System.out.println("     Order Summary                ");
         System.out.println("----------------------------------");
         System.out.println(

         );
         System.out.println("Sr no.  ItemName   ItemQuantity   $Pprice/Unit     TotalPrice");
         System.out.println("--------------------------------------------------------------");
         System.out.println("1.        Pizza         5             12.5            62.5   ");
         System.out.println("2.      Garlic Bread    3             5.99            17.97  " );
         System.out.println("3.        Beverages     3             1.9             5.9700003");
         System.out.println("----------------------------------------------------------------");
         System.out.println("Total Bill:$"+TotalPrice);
         System.out.println("Discount Offer:10%");
         System.out.println("Amount To Be Paid:$77.796005");
         System.out.println("---------------------Thank You-------------------------------------");
     }
}