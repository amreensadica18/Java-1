package com.sample;
import java.util.Arrays;
public class BinarySearch {
public static void main(String[] args) {
int[] a = {10,15,20,25,45,55,85,1,2,9,53};
int binarySearch = Arrays.binarySearch(a, 25);
System.out.println(binarySearch);
}
}
