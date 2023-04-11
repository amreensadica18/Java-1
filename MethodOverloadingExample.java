// Sample program for Method overloading
package sample;
public class Test {
public void studentDetails(String name) {
System.out.println("Student Name: " + name);
}
public void studentDetails(int age, long mobileNo) {
System.out.println("Student Age: " +age);
System.out.println("Student Mobile No: " +mobileNo);
}
public void studentDetails(String bg, String gender) {
System.out.println("Student Blood Group: " +bg);
System.out.println("Student Gender: " +gender);
}
public static void main(String[] args) {
Test tt = new Test();
tt.studentDetails("Prabhaharan");
tt.studentDetails(22, 8189978448l);
tt.studentDetails("O+", "Male");
}
}
