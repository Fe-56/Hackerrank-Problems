import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder adder = new Adder();
        System.out.println("My superclass is: Arithmetic");
        System.out.print(adder.add(1, 41);
        System.out.print(" ");
        System.out.print(adder.add(1, 12));
        System.out.print(" ");
        System.out.print(adder.add(1, 19));
    }
}

class Arithmetic{
    int add(int a, int b){
       return a + b; 
    }
}

class Adder extends Arithmetic{

}