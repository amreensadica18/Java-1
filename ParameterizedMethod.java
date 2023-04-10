// Sample program for parameterized method.
package com.aiite.sample;
public class Test5 {
public void add(int a) {
System.out.println("Parameterized Method");
System.out.println(a);
}
public void studentDetails(String name, int age, String bloodgroup) {
System.out.print("Student Name: "+name+" ");
System.out.print("Student Age: "+age+" ");
System.out.println("Student BloodGroup: "+bloodgroup);
}
public static void main(String[] args) {
Test5 tt = new Test5();
tt.studentDetails("Prabhaharan", 20, "O+");
}
}
