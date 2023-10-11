package com.company;

public class visitor {
    static int count;
    public void visitorCount()
    {
        count++;
        System.out.println("You are a visitor number"+count);
    }

    public static void main(String[] args) {
        visitor visitor1=new visitor();
        visitor visitor2=new visitor();
        visitor visitor3=new visitor();
        visitor1.visitorCount();
        visitor2.visitorCount();
        visitor3.visitorCount();
    }
}
