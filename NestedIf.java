package com.sample;
public class NestedIf {
public static void main(String[] args) {
int age = 45;
if (age>=18 && age<=59) {
System.out.println("Major");
} 
if (age>=60) {
System.out.println("Senior");
} 
if (age<18) {
System.out.println("Minor");
}
}
}
