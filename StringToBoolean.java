public class StringToBoolean {
  public static void main(String[] args) {
    String str1 = "false";
    String str2 = "true";

    boolean b1 = Boolean.parseBoolean(str1);
    boolean b2 = Boolean.parseBoolean(str2);

    System.out.println(b1);    
    System.out.println(b2);   
  }
}
