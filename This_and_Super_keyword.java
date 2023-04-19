class Animal{  
String color="brown";  
}  
class Dog extends Animal{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
class Test1{  
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  
}}
