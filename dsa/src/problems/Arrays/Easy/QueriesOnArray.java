package problems.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class QueriesOnArray {

    // N is the size of the array
    // M is the number of queries to perform
    static OptionalInt queriesOnArray(int N, int M, List<List<Integer>> queries) {
        int[] array = new int[N];

        for (List<Integer> list : queries) {
            // Validate list size
//            if (list.size() != 3) {
//                throw new IllegalArgumentException("Each query must contain exactly 3 elements.");
//            }

            int A = list.get(0);
            int B = list.get(1);
            int V = list.get(2);

            // Ensure indices A and B are within the bounds of the array
//            if (A < 0 || B >= N || A > B) {
//                throw new IllegalArgumentException("Invalid indices in query.");
//            }

            for (int i = A; i <= B; i++) {
                array[i-1] += V;
            }
        }

        return Arrays.stream(array).max();
    }

    public static void main(String[] args) {
        List<List<Integer>> queries = new ArrayList<>();

        // Correctly add each query list separately
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(100);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(5);
        list2.add(100);

        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(4);
        list3.add(100);

        queries.add(list1);
        queries.add(list2);
        queries.add(list3);

        OptionalInt result = queriesOnArray(5, 3, queries);
        if (result.isPresent()) {
            System.out.println("Maximum element is: " + result.getAsInt());
        } else {
            System.out.println("Array is empty.");
        }
    }
}

