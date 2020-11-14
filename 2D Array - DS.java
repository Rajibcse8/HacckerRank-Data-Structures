
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import static java.lang.Integer.min;
import static java.lang.Integer.max;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;


public class Solution {
    
    public static int   solve(int i,int j,int[][] arr){
        int value=0;
        value+= arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
    
        return value;
    }
    
    
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

      int r=6,c=6;
    
      int[][] arr=new int[r][c];
      for(int i=0;i<r;i++)for(int j=0;j<c;j++)arr[i][j]=scan.nextInt();
       int maxi=Integer.MIN_VALUE;
       for(int i=0;r-i>2;i++){
           for(int j=0;c-j>2;j++){
           int ans=solve(i,j,arr  );
              maxi=max(maxi,  solve(i,j,arr  ) );
           }
           
       }
       
        System.out.println(maxi);
    }}
