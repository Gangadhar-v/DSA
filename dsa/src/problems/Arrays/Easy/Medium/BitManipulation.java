package problems.Arrays.Easy.Medium;


/*
input -> Binary Array of size n and integer k
output -> maximum number of consecutive 1's in the array after flipping 'k' 0's
 */
public class BitManipulation {

    public static long bitManipulation(int[] binaryArray,int k){
        int maxOnes = 0;
        for(int start = 0;start< binaryArray.length;start++){
            for(int end = start;end< binaryArray.length;end++){
                int zeroCount = 0;
                for(int i = start;i<=end;i++){
                    if(binaryArray[i] == 0){
                        zeroCount++;
                    }
                }
                if(zeroCount<=k){
                    maxOnes = Math.max(maxOnes,end-start+1);
                }
            }
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[] array = {1,1,1,0,0,1,1,1,1,0};
        int[] array2 = {1,0,0,1,0,1,0,0,1,0,0,0};
        System.out.println(bitManipulation(array, 2));
        System.out.println(bitManipulation(array2,4));
    }
}
