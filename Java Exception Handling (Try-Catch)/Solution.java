import java.io.*;
import java.util.*;

import javax.swing.SpinnerDateModel;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        String output = new String();

        try{
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);
            scanner.close();
        }

        catch (InputMismatchException ex1){
            output = "java.util.InputMismatchException";
            // System.out.println("java.util.InputMismatchException");
        }

        catch (ArithmeticException ex2){
            output = "java.lang.ArithmeticException: / by zero";
            // System.out.println("java.lang.ArithmeticException: / by zero");
        }

        finally{
            System.out.println(output);
        }
    }
}