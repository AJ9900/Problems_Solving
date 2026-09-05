# Array Manipulation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each array element between two given indices, inclusive.  Once all operations have been performed, return the maximum value in the array.  

**Example**  
$n = 10$  
$queries = [[1, 5, 3], [4, 8, 7], [6, 9, 1]$  

Queries are interpreted as follows:  
```
    a b k
    1 5 3
    4 8 7
    6 9 1
```

Add the values of $k$ between the indices $a$ and $b$ inclusive:


![image](https://s3.amazonaws.com/hr-assets/0/1738699658-ff37fa31d8-array_manipulation_example.png)

The largest value is $10$ after all operations are performed.  

**Function Description**  

Complete the function $arrayManipulation$ with the following parameters:

- $int\ n$: the number of elements in the array  
- $int\ queries[q][3]$: a two dimensional array of queries where each $queries[i]$ contains three integers, $a$, $b$, and $k$.  

**Returns**  

- $int$: the maximum value in the resultant array  

**Input Format**

The first line contains two space-separated integers $n$ and $q$, the size of the array and the number of queries.  
Each of the next $q$ lines contains three space-separated integers $a$, $b$ and $k$, the left index, right index and number to add.  

**Constraints**

- $3 \le n \le 10^{7}$  
- $1 \le m \le 2 * 10^{5} $  
- $1 \le a \le b \le n   $  
- $0 \le k \le 10^{9}  $  


**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T18:02:42.629Z  

```java
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

class Result {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here

    long[] arr = new long[n + 2];

    for(List<Integer> q : queries) {
        int a = q.get(0);
        int b = q.get(1);
        int k = q.get(2);

        arr[a] += k;
        arr[b + 1] -= k;
    }

    long sum = 0;
    long max = 0;

    for(int i = 1; i <= n; i++) {
        sum += arr[i];

        if(sum > max) {
            max = sum;
        }
    }

    return max;
}
    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = Result.arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/crush/problem)