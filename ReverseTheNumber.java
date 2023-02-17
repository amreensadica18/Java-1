import java.util.*;
public class ReverseTheNumber
{
	public static void main(String args[])	
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number ");
        int n=sc.nextInt();
        int rem=0;
        while(n>0){
            rem= ( rem*10 )+n%10;
            n=n/10;
        }
        System.out.println(rem);
                  
	}
}
