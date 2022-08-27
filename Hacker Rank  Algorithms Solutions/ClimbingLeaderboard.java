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
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List < Integer > climbingLeaderboard(List < Integer > ranked, List < Integer > player, int rankCount, int playerCount) {
        // Write your code here
        LinkedList < Integer > rankIndex = new LinkedList < Integer > ();
        ranked.add(0);
        int previous = 0;
        int rank = 0;
        int S = player.size() - 1;
        int i = 0;
        while (i < ranked.size()) {
            if (S < 0) {
                break;
            }
            if (previous != ranked.get(i)) {
                rank++;
            }
            previous = ranked.get(i);
            if (player.get(S) >= ranked.get(i)) {
                rankIndex.addFirst(rank);
                S--;
            } else {
                i++;
            }
        }
        return rankIndex;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List < Integer > ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List < Integer > player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List < Integer > result = Result.climbingLeaderboard(ranked, player, rankedCount, playerCount);

        bufferedWriter.write(
            result.stream()
            .map(Object::toString)
            .collect(joining("\n")) +
            "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
