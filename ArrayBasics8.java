//Program to find whether the given input is in the array or not.
public class ArrayBasics8 {
    public static void main(String[] args) {
        int []a={10,20,30,40,50,60};
        int key=60;
        boolean KeyIsPresent=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                KeyIsPresent = true;
                System.out.println("Number is present in the array");
                break;
            }
        }
        if(KeyIsPresent==false){
                System.out.println("Number not present");
        }
    }
}
