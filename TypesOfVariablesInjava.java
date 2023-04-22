package com.sample;
public class Test4 {
int a = 20; // Class level variable 
public void sample() {
int a = 25; // local variable
System.out.println(a);
}
public static void main(String[] args) {
int a = 15; //Instance variable
System.out.println(a);
Test4 tt = new Test4();
System.out.println(tt.a);
tt.sample();
}
}
