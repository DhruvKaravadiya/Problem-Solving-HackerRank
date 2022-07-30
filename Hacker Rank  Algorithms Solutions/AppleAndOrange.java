/*Solution no - 1

-Space Complexity : O(1) 
-Runtime : O(m + n)

-Reduces time conplexity by avoiding declaring array
*/
  /*
     * The function accepts following parameters:
     *  1. INTEGER s - starting point of Sam's house location.
     *  2. INTEGER t - ending location of Sam's house location.
     *  3. INTEGER a - location of the Apple tree.
     *  4. INTEGER b - location of the Orange tree.
     *  5. INTEGER_ARRAY apples - distances at which each apple falls from the tree.
     *  6. INTEGER_ARRAY oranges -  distances at which each orange falls from the tree.
     */
public class AppleAndOrange {

    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    
    int s = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    int n = sc.nextInt();
    int countA = 0;   
    for(int i = 0; i< m ; i++){
        int applePos = a + sc.nextInt();
        if(applePos >= s && applePos <= t){
            countA++;
        } 
    }
    int countB = 0;
    for(int i = 0; i< n ; i++){
        int orangePos = b + sc.nextInt();
        if( orangePos >= s && orangePos <= t ){
            countB++;
        } 
    }
    System.out.println(countA+"\n"+countB);
    }

}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
