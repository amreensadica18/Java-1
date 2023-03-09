//Program to swap the numbers in the array.
public class ArrayBasics9 {
    public static void main(String[] args) {
        int []a={10,20,30,40,50,60};
        int temp=a[0];
        int i=0;
        while(i<a.length-1){
            a[i]=a[i+1];
            i++;
        }
        a[i]=temp;
          
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
