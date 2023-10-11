package com.company;

import java.util.HashMap;

class Employee{
    String EmpName;
    String DOJ;
    int EmpId;
    String dep;
    float salary;

    double salaryHike(float hikePercenatage,float salary)
    {
        return (salary*hikePercenatage/100)+salary;

    }

}
public class StartupOrg {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.salary=1000;
        System.out.println("Pervious Salary:"+e.salary);
        double result=e.salaryHike(20,e.salary);
        System.out.println("New Salary"+result);

    }
}
