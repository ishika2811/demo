import java.sql.SQLOutput;

  class visitor
 {

    static int count;

     public static void setCount(final int count) {
         visitor.count = count;
     }

     public void visitorCount(){
        count++;
        System.out.println("you are a visitor number");


        }
        public static void main(String[] args){
        visitor visitor1=new visitor();
visitor visitor2=new visitor();
visitor1.visitorCount();
visitor2.visitorCount();

    }
}