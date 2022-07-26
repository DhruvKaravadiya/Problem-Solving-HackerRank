import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Scanner;

//----------------------------------------------------------------------------------------------------------------------------
 /*
 
//Solution - 1 
//Using List and its  .add() method to return Integer  Array
     
     
class Result {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here
    List <Integer> retAns = new ArrayList<Integer>();
    int bob = 0, alice = 0;
    for(int i = 0 ; i < a.size() ; i ++){
            if(a.get(i) > b.get(i)){
               alice++;
            }
            else if(b.get(i) > a.get(i)){
                bob++;
            }
        } 
        retAns.add(alice);
        retAns.add(bob);
        return retAns;
    }

}

 //This Solution class is loaded automatically in Hacker Rank Java 8 solution pannel and 
 //we just have to complete the compareTriplets function
public class Solution {      
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/
//----------------------------------------------------------------------------------------------------------------------------

//Solution - 2 
//Using Ternery Operator

/*
public class Solution {
    public static void main(String[] args)  {
    Scanner scObj = new Scanner(System.in);
    int [] a = new int [3];
    int [] b = new int [3];
    for(int i = 0 ; i < 3 ; i++){
        a[i] = scObj.nextInt();
        }          
    for(int i = 0 ; i < 3 ; i++){
        b[i] = scObj.nextInt();
        }  
    System.out.println((((a[0]>b[0])?1:0)+((a[1]>b[1])?1:0)+((a[2]>b[2])?1:0))+" "+(((a[0]<b[0])?1:0)+((a[1]<b[1])?1:0)+((a[2]<b[2])?1:0)));            
    }
}
*/


//------------------------------------------------------------------------------------------------------------------------------------

