package problems.SearchingNSorting;

import java.util.ArrayList;

public class SearchElement {
    public static ArrayList<Integer> searchElement(int[] array, int[] e){

        ArrayList<Integer> result = new ArrayList<>();
        for(int element:e){
          int index =   BinarySearch(array,element);
          result.add(index);
        }
        return result;
    }

    public static int BinarySearch(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {         //while(low<high) this condition skips the middle element;

            int mid = low + (high - low) / 2;
            if ( array[mid]==element ) return mid;

            if (element < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int[] e = {5,15};
      //  System.out.println(BinarySearch(array,13));
        System.out.println(searchElement(array,e));
    }
}
