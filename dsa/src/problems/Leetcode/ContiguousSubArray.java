package problems.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
PROBLEM STATEMENT
input list  scores -> (5, 4, 2, 4)

valid contiguous array only when the difference between any consecutive games is at most 2 points
 */
public class ContiguousSubArray {
    public static int findValidSubarrays(List<Integer> scores) {
        int count = 0;

        // Generate all contiguous subarrays
        for (int start = 0; start < scores.size(); start++) {
            for (int end = start; end < scores.size(); end++) {
                boolean valid = true; // Reset valid for each new subarray

                // Check all pairs in the current subarray
                for (int i = start; i <= end; i++) {
                    for (int j = i + 1; j <= end; j++) {
                        int difference = Math.abs(scores.get(i) - scores.get(j));
                        if (difference > 2) {
                            valid = false; // Mark as invalid if any difference exceeds 2
                            break; // Exit inner loop if invalid
                        }
                    }
                    if (!valid) break; // Exit the outer loop if invalid
                }

                // Count this subarray if it remains valid
                if (valid) {
                    count++;
                }
            }
        }

        return count;
    }

    //wrong output
    public static int findValidSubarrays2(List<Integer> scores) {
        int count = 0;

        // Generate all contiguous subarrays
        for (int start = 0; start < scores.size(); start++) {
            boolean valid = true; // Reset valid for each new subarray

            // Check differences only between consecutive elements
            for (int end = start; end < scores.size(); end++) {
                if (end > start) { // Only check when there are at least 2 elements
                    int difference = Math.abs(scores.get(end) - scores.get(end - 1));
                    if (difference > 2) {
                        valid = false;
                        break; // Exit if any consecutive difference exceeds 2
                    }
                }
                // If the current subarray remains valid, count it
                if (valid) {
                    count++;
                }
            }
        }

        return count;
    }




    public static void main(String[] args) {
        List<Integer> scores = List.of(5, 4, 2, 4);
        List<Integer> scores1 = List.of(1,2,3);
        System.out.println(findValidSubarrays2(scores));
    }
}

