package com.sample;
public class FinalKeyword {
final static String name3 = "Raj Kumar"; 
final public void sample(String a) {
System.out.println(a);
}
public static void main(String[] args) {
Test tt = new Test();
System.out.println(name3);
tt.sample("Hi everyone");
final int no = 5;
System.out.println(no);
}
}
