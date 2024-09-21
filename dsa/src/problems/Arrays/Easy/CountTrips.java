package problems.Arrays.Easy;

import java.util.Arrays;

public class CountTrips {

    static int calculateTrips(float weights[]){

        //sort the weights array
        Arrays.sort(weights);


        int left = 0;
        int right = weights.length - 1;
        int trip = 0;

        /*termination condition when left exceeds right or equal,
        this condition makes to don't consider weights already in the trip, and
        including the scenario where only one element remains to be processed
         */
        while(left <=right){

            if(weights[left]+weights[right] <=3){
                left++;
            }
            /*
            method ensures that even if the two elements can't be paired,
            the heaviest item (weights[right]) is always
             removed from consideration and counted as a separate trip.
             */
            right--;
           /* The trip counter is always incremented regardless of whether
            the two items were paired or not, because a trip has been made.
            */
            trip++;
        }


        return trip;

    }

    public static void main(String[] args) {
        float weights[] = {1.5f, 2.5f, 1.01f, 1.99f, 2.0f, 1.75f};
        int trips = calculateTrips(weights);
        System.out.println(trips);
    }
}
