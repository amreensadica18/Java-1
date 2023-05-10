//Java program to create a two dimensional array to print the given numbers.
public class Two_D_Arrays{
    public static void main(String[]args){
        int a[][]=new int[5][5];
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[0][3]=40;
        a[0][4]=50;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]!=0)
                System.out.println(a[i][j]);
            }
        }
        
     }
}
