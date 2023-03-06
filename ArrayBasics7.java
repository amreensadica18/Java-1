//Program to check whether the content in the given string is number or not using Exception.
public class ArrayBasics7 {
    public static void main(String[] args) {
      int[] a={50,60,70,80,90};
      String s= "123";
      try{
      int i=Integer.parseInt(s);
      System.out.println("Yes it is a number.");
      }
      catch(NumberFormatException e){
          System.out.println("It is not a number");
      }
       
    }
            
}
