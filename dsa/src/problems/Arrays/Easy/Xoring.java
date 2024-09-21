package problems.Arrays.Easy;


//return the maximum xoring of two element in array
public class Xoring {

    static int xoring(int[] array){

        int maxResult = Integer.MIN_VALUE;
        for(int i = 0; i< array.length-1;i++){
            for(int j = i+1;j< array.length;j++){
                int xor = array[i]^array[j];
               maxResult = Integer.max(maxResult,xor);
            }
        }


        return maxResult;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5};
        System.out.println(xoring(arr));
    }
}
