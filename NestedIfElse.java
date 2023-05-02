package com.aiite.sam2;

public class NestedIfElse {

public static void main(String[] args) {

int age = 17;

if (age>=18 && age<=59) {

System.out.println("Major");

} else if (age>=60) {

System.out.println("Senior");

} else if (age<18) {

System.out.println("Minor");

}

}

}
