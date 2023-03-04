// Program to print the minimum value in the given input values.
public class ArrayBasics5 {
    public static void main(String[] args) {
      int[] marks={50,60,70,80,90};
      int min=100;
      int i=0;
    while(i<marks.length){
            if(marks[i]<min)
            min=marks[i];
            i++;
        }
        System.out.println("Minimum mark is: " +min);
        
    }
            
}
