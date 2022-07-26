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

-------------------------------------------------------------------------------
//Solution number 1 :  
//Simplest method using simple for loop
public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int sum=0;
		String[] input = br.readLine().split(" ");
		for(String value:input)
		{
			sum += Integer.parseInt(value);
		}
		System.out.println(sum);
    }
}
--------------------------------------------------------------------------------
//Solution number 2 :
//Intermediate solution using LinkedList
  
