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
import java.util.*;

//---------------------------------------------------------------------------------

//Solution Number 1:
//Solution using for loop
/*
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
}*/


//---------------------------------------------------------------------------------

//Solution Number 2:
//Solution using LinkedList

/*
class Result {
    public static int simpleArraySum(List<Integer> ar) {   
        int ans = 0;
        for(int i = 0; i < ar.size(); i++){
            ans += ar.get(i);
        }
        return ans;
    }
}

public class SimpleArraySumUsingList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

*/
//---------------------------------------------------------------------







