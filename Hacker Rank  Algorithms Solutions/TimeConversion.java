//Solution -1 
//Simplest Solution
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        int hour = Integer.parseInt(time.substring(0,2))%12;
        if(time.contains("PM")) hour += 12;
        System.out.printf("%02d%s",hour,time.substring(2,8));
    }
}

//Solution - 2
//Returning a string using the function timeconversion
