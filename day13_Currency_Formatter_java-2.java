
package nurzana;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class day13_Currency_Formatter_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat fUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat fIndi = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat fCina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us = fUS.format(payment);
        String india = fUS.format(payment);
        String china = fUS.format(payment);
        String france = fUS.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
}
