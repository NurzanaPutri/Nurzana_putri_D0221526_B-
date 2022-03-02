
package nurzana;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day10_java_Static_Initializer_Block {
    public static void main(String[] args) {
        
    }
    static Scanner sc = new Scanner (System.in);
 static int B = sc. nextInt();
 static int H = sc. nextInt();
 static boolean flag = true ;
 
 static {
     try{
         if (B<=0 || H<=0){
             flag = false;
             throw new Exception ("Breadth and height must be positive");
         }
     }catch (Exception ex){
         System.out.println(ex);
     }
 } 
    
}
