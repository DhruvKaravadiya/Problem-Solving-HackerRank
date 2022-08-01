//Solution - 1

import java.util.Scanner;
import java.util.*;
public class Solution{
    public static void main(String[] args) {
    // W rite your code here
    Scanner sc = new Scanner(System.in);
    //BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    String a[]=sc.nextLine().split(" ");
    long temp = 0 ;
    long sum=0;
    Arrays.sort(a);
    for(int k = 0 ; k < a.length ; k++){
        sum+=Long.parseLong(a[k]);
    }
    System.out.println((sum-Long.parseLong(a[a.length-1]))+" "+(sum-Long.parseLong(a[0])));
    
        
    }
}
