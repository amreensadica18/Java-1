package com.sample;
public class Test3 {
public static void main(String[] args) {
int a[] = {1,2,3,4,5,6,7,8,9,10};
System.out.println("Length of the array: "+a.length);
System.out.println(a[5]);
for (int i : a) {
System.out.println(i);
}
String b[] = {"Raj","Vimal","Hema","Perumal"};
for (int i = 0; i < b.length; i++) {
System.out.println(b[i]);
}
for (String out : b) {
System.out.println(out);
}
}
}
