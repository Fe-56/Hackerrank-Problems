import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        ArrayList<Integer> hourGlass = new ArrayList<>();

        for (int i = 0; i < arr.size() - 2; i++) { // iterate through the entire 2D array, arr
            for (int j = 0; j < arr.get(i).size() - 2; j ++){
                int sum = 0;
                sum += arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2); // to get the top of the hourglass
                sum += arr.get(i + 1).get(j + 1); // to get the middle of the hourglass
                sum += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2); // to get the bottom of the hourglass
                hourGlass.add(sum);
            }
        }

        System.out.println(Collections.max(hourGlass));
    }
}
