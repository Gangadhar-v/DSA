package problems.Arrays.Easy.Medium;



//return the number of subarray that have LCM value as K, of an array;

/*
solution
note -> initialize the lcm value for the subArray as the first element
1.compute LCM for all subArray
2.increment  count if LCM == k;
 */
public class LCMequals {

    public static int lcmEquals(int[] array,int k){

        int count = 0;
        for(int start = 0; start<array.length; start++){
            for( int end = start; end< array.length;end++){
                int lcmValue = array[start];
                for(int i = start+1;i<=end;i++){
                    lcmValue = lcm(lcmValue,array[i]);
                }
                if(lcmValue == k){
                    count++;
                }
            }
        }
        return count;

    }

    public static int lcm(int a,int b){
        return a*(b/gcd(a,b));
    }

   public static int gcd(int a,int b){

        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;

    }

    public static void main(String[] args) {
        int[] array = {3, 6, 2, 7 ,1};
        System.out.println(lcmEquals(array,6));
    }
}
