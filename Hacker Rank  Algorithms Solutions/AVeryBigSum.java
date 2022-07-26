//--------------------------Solution - 1-------------------------Using BigInteger-------------------- 

/*
import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scObj = new Scanner(System.in);
        String n = scObj.nextLine();  //dont need this , but had to input to match the result in hacker rank outputs
        String strInput2 = scObj.nextLine();
        String [] strArr = strInput2.split(" ");

         BigInteger sum = new BigInteger("0");
        
         for(String i: strArr){
             BigInteger bigObj = new BigInteger(i);
             sum = sum.add(bigObj);
         }
         System.out.print(sum);
    }    
}
*/


--------------------------------------------------------------------------------------------------------------
