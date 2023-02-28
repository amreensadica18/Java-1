//Program to print the values given by the user using Scanner class.
import java.util.*;
public class ArrayBasics1 {
    public void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int count=sc.nextInt();
        int []values= new int[count];
        System.out.println("Enter the numbers:");
        int i=0;
        while(i<count){
            values[i]=sc.nextInt();
            i++;
        }
        for(i=0;i<count;i++){
            System.out.println(values[i]);
            }
        }
}
