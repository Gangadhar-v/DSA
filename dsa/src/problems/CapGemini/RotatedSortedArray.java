package problems.CapGemini;


/*PROBLEM STATEMENT
input = rotated array -> {7,8,9,0,1,2,3,4,5,6}
 */
public class RotatedSortedArray {

    public static void main(String args[]){
        int[] arr = {7,8,9,0,1,2,3,4,5,6};
        System.out.println(searchIndex(arr,5));
    }


    public static int  searchIndex(int[] arr,int target){

        int start = 0;
        int end = arr.length -1;


        while(start<=end){

            //calculating mid in each iteration
            int mid = start+(end - start)/2;
            if(arr[mid] == target ) return mid;


            //if left is sorted
            if(arr[start]<=arr[mid]){

                if(arr[start]<=target && target<=arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }


            }else{

                if(arr[mid]<= target && target <= arr[end]){
                    start = mid +1;
                }else{
                    end = mid -1;
                }

            }


        }

        return -1;
    }

}
