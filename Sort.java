package com.sample;
import java.util.Arrays;
public class SortArray{
public static void main(String[] args) {
int[] a = {10,15,20,25,45,55,85,1,2,9,53};
Arrays.sort(a);
for (int i = 0; i < a.length; i++) {
System.out.println(a[i]);
}
}
}
