import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Solution.Inner.Private o = new Solution.Inner().new Private();
        System.out.println(o.powerof2(num));
        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        scanner.close();
    }

    static class Inner{
        private class Private{
            String powerof2(int num){
                if ((num & num - 1) == 0){
                    return num + " is power of 2";
                }

                else{
                    return num + " is not a power of 2";
                }
            }
        }
    }
}