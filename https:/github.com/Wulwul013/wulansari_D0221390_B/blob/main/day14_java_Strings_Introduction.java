package wulansari;
import java.io.*;
import java.util.*;

public class day14_java_Strings_Introduction {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */


        System.out.println(A.length() + B.length());

        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
