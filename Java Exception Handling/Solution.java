import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            try{
                String xString = scanner.next();
                String yString = scanner.next();

                int x = Integer.parseInt(xString);
                int y = Integer.parseInt(yString);
        
                Calculator calculator = new Calculator();
                System.out.println(calculator.power(x, y));
            }

            catch(Exception e){
                if (e.getMessage().equals("0")){
                    System.out.println("java.lang.Exception: n or p should not be negative.");
                }
    
                else if (e.getMessage().equals("1")){
                    System.out.println("java.lang.Exception: n and p should not be zero.");
                }
            }
        }

        scanner.close();
    }
}

class Calculator{
    long power(int n, int p) throws Exception{
        if ((n < 0) || (p < 0)){
            throw new Exception("0");
        }

        else if ((n == 0) && (p == 0)){
            throw new Exception("1");
        }

        else{
            return (long) Math.pow(n, p);
        }
    }
}