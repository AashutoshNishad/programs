/**
 * Dynamic 
 * Longest comman subsequence 
 * Dynamic aproach
 */
public class Dynamic {

    public static void main(String[] args) {
        
String s1  = "hellow"; 
String s2 = "el";
System.out.println(lcs(s1, s2 , s1.length(), s2.length() , new int[s1.length()+1][s2.length() + 1]));

    }


    public static int lcs(String s1 , String s2 , int i , int j , int M[][]  ){

        if(i == 0 || j == 0){
            return 0;
        }
      if (M[i][j]>0) {
          System.out.println("i " + i + " j "+ j);
          return M[i][j];
      }
        int value ;
        if (s1.charAt(i-1) == s2.charAt(j-1)) {
            value = lcs(s1, s2, i-1, j-1, M)+1;
        } else {
            value = max(lcs(s1, s2, i-1, j, M) , lcs(s1, s2, i, j-1, M));
        }
        M[i][j] = value;
        return value;
    }


    private static int max(int lcs, int lcs2) {
        return lcs < lcs2 ? lcs2 : lcs;
    }

}