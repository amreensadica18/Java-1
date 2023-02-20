import java.util.Scanner;
public class Palindrome
{
	public static void main(String arg[])	
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number ");
        int num=sc.nextInt();
        int t=num;
        int check=0;
        int temp=0;
        for(temp=0;num>0;num/=10)
	    {
	    temp=num%10;
	    check=(check*10)+temp;
	    }
	   if(check==t)
		System.out.println(t+" is a palindrome number ");
                  else
		System.out.println(t+" is not a palindrome number ");
                  
	}
}
