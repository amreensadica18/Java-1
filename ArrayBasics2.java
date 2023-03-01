//program to print sum of numbers given by the user using scanner class.
import java.util.*;
public class ArrayBasics2 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int count=sc.nextInt();
        int []values= new int[count];
        System.out.println("Enter the numbers:");
        int i=0;
        while(i<count){
            values[i]=sc.nextInt();
            i++;
            sum=sum+i;
        }
        System.out.println("Sum is: "+sum);
        
        }
}
