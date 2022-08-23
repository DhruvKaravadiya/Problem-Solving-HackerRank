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

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List < Integer > a, List < Integer > b) {
        // Write your code here
        int aSize = a.size();
        int bSize = b.size();
        int mn = b.get(0);
        int cn = 0;
        for (int i = 1; i < bSize; i++) {
            if (b.get(i) < mn)
                mn = b.get(i);
        }
        int j, k;
        for (int i = 1; i <= mn; i++) {
            j = 0;
            k = 0;
            while (j < n) {
                if (i % a.get(j) != 0) {
                    break;
                }
                j++;
            }
            if (j == n) {
                while (k < m) {
                    if (b.get(k) % i != 0) {
                        break;
                    }
                    k++;
                }
                if (k == m)
                    cn++;
            }
        }
        return cn;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List < Integer > arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List < Integer > brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
