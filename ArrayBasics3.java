// Program to print the count number for the given input array.
public class ArrayBasics3 {
    public static void main(String[] args) {
        int count=0;
        int[] marks={50,60,70,80,90};
        
        for(int i=0;i<marks.length;i++){
            if(marks[i]>=60)
            count++;
        }
            System.out.println(count);
            
        
        
    }
}
