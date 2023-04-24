package com.sample;
public class Test1 {
static {                            //which is executed before main method. 
System.out.println("First executing");
}
static {
System.out.println("Second executing");
}
public static void main(String[] args) {
System.out.println("Third executing");
}
}
