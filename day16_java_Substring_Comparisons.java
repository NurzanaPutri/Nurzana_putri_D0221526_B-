package wulansari;
import java.util.Scanner;

public class day16_java_Substring_Comparisons {
    public static void main(String[] args) {
        
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        
      int lastIndex = s. length()-k;
      smallest = s. substring (0,k);
      largest = s. substring (0,k);
      for (int i=0;i<= lastIndex;i++){
          String sub = s. substring(i, i+k);
          //System.out.println(sub);
          if(smallest.compareTo(sub)>0){
              smallest = sub;
          }
          if(largest.compareTo(sub)<0){
              largest = sub;
          }
      } 
        return smallest + "\n" + largest;
    }
    
