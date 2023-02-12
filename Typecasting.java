public class Typecasting {
  public static void main(String[] args) {
    double d = 4.55d;
    float f = 1.25f;
    int i = (int)d; // Explicit casting: double to int
    int i2 = (int)f; // Explicit casting: float to int

    System.out.println("Double Value: "+d); 
    System.out.println("Double to int: "+i); 
    System.out.println("Float value: "+f); 
    System.out.println("Float to int: "+i2); 
  }
}
