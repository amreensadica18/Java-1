class Animal{  
String color="Brown";  
}  
class Dog extends Animal{  
String color="Grey";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
class TestSuper{  
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  
}
}  
