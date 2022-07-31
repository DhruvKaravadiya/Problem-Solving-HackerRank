/*
//Solution - 1 

import java.util.Scanner;
 
public class DiagonalDiffernce {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int [][] arr = new int [m][m];
        int sum1 = 0, sum2 = 0 ;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
                if(i==j){
                    sum1 += arr[i][j];
                }
                if(i+j == (m-1)){
                   sum2+=arr[i][j]; 
                }
            }
        }
        System.out.println(Math.abs(sum1-sum2));
        sc.close();
    }
}
                */
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
