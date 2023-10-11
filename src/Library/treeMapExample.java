package Library;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

class Employee{
     String name;
     int age;
     Employee(String name,int age)
     {
         this.name=name;
         this.age=age;

     }
}
public class treeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,Employee>tr=new TreeMap<>();
        tr.put(1,new Employee("Ishika",19));
        tr.put(2,new Employee("Babu",17));
        System.out.println(tr);


                for(Map.Entry<Integer,Employee>emp:tr.entrySet())
                {
                    System.out.println(emp.getKey()+ " "+emp.getValue());
                }
    }
}





