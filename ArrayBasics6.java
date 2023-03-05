//Program to find the second maximum value.
public class ArrayBasics6 {
    public static void main(String[] args) {
      int[] a={50,60,70,80,90};
      int max=0,secondMax=0;
      for(int i=0;i<a.length;i++){
      if(a[i]>max){
          secondMax= max;
          max=a[i];
      }
      else if(a[i]>secondMax){
          secondMax=a[i];
      }
      }
        System.out.println("Maximum value  is: " +max);
        System.out.println("Second Maximum value is: " +secondMax);
    }
 
