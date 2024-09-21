package problems.Basic;

import java.util.Arrays;

/*
given 2 sorted arrays,
you have to merge these arrays and return the median of the array

for array of size odd, the median is middle element
for array of size even, the median is sum of two middle elements
 */
public class MedianOfArrays {

    public static int medianOfArrays(int[] Arr,int[] Brr){


        int[] mergedArray = new int[Arr.length+Brr.length];
        System.arraycopy(Arr,0,mergedArray,0,Arr.length);
        System.arraycopy(Brr,0,mergedArray,Arr.length,Brr.length);
        int size = mergedArray.length;
        Arrays.sort(mergedArray);
        if(mergedArray.length%2 == 1){  //odd length
            return mergedArray[size/2];
        }else{
            return (mergedArray[(size/2)-1] + mergedArray[size/2])/2;
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1, 12, 15, 26, 38};
        int[] array2 = {2, 13, 17, 30, 45};
        System.out.println(medianOfArrays(array1,array2));
    }
}
