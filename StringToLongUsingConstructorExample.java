public class StringToLongUsingConstructorExample {
   public static void main(String[] args)
   {
       String str = "10000";
       String str2 = "22222";
       //Conversion using Long(String s) constructor
       long num = new Long(str);
       long num2 = new Long(str2);
       System.out.println(num*num2);		
   }
}
