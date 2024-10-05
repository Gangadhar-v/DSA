package problems.Arrays.Medium;


//return the number of subArrays count that have the gcd of k
public class GCDequals {

    public static int gcdEquals(int[] array, int k){

        //each subArray consists of array with starting index to end of the array
        int count = 0;
        for(int start = 0;start<array.length;start++){
            int currentGcd = array[start];
            for(int end=start;end<array.length;end++){
                for( int i = start+1;i<=end;i++){
                    currentGcd = gcd(currentGcd,array[i]);
                }
                if(currentGcd == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[]){
        int[] array = {9, 3, 1, 2, 6, 3};
        System.out.println(gcdEquals(array,3));

    }
}
