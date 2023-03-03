// Program to print the maximum value in the given input values.
public class ArrayBasics4 {
    public static void main(String[] args) {
      int[] marks={50,60,70,80,90};
      int max=0;
      int i=0;
    while(i<marks.length){
            if(marks[i]>max)
            max=marks[i];
            i++;
        }
        System.out.println("Maximum mark is: " +max);
        
    }
            
}
