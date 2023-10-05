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

/*Hacker Rank wont let you copy the question but basically you needed to search through an array of arrays (List) and eafch of those array contained 
indexes of what to "negate" in the data list of course per hacker rank nothing was zero indexed so You had to do that yourself, But of course
It takes you 13 minutes to notice that hacker rank fails to mention that they dont zero their indexes and with terms like "negate"
i.e multiplying by -1 NOT negate as that would mean to eliminate. You finally figure out the easy solution in 10 minutes with 30 minutes spent wondering 
why they wrote the Question the way they did.
*/


class Result {

    /*
     * Complete the 'getFinalData' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY data
     *  2. 2D_INTEGER_ARRAY updates
     */

    public static List<Integer> getFinalData(List<Integer> data, List<List<Integer>> updates) {
        System.out.println(updates);
        System.out.println(data);
        int startIndx = 0;
        int endIndx = 0;
    for (List<Integer> arr : updates){
        startIndx = arr.get(0) - 1;
        endIndx = arr.get(arr.size() - 1) - 1;
        
        for (int i = startIndx; i <= endIndx; i++){
            System.out.println(data.get(i) + " changed to: " + (data.get(i) * -1));
            data.set(i, data.get(i) * -1);
        }
    }
    return data;
    }

}
