import java.util.Scanner;

public class Solution {
       
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
   
        
        int n=scan.nextInt();
        int[]arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[n-i-1]=scan.nextInt();
        }
        for(int i=0;i<n;i++)System.out.print(arr[i]+" ");    
}}
