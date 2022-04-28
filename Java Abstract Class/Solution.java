import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String myString = "";

        while (scanner.hasNext()){
            myString += scanner.next() + " ";
        }

        scanner.close();

        MyBook myBook = new MyBook();
        myBook.setTitle(myString);
        System.out.println("The title is: " + myBook.getTitle());
    }
}

abstract class Book{
    String title;

    abstract void setTitle(String s);

    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    @Override
    void setTitle(String s){
        title = s;
    }
}