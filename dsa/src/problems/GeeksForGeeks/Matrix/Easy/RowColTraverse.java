package problems.GeeksForGeeks.Matrix.Easy;

import java.util.Arrays;

/* PROBLEM STATEMENT

Input : mat[][] = {{1, 2, 3},
                   {4, 5, 6},
                   {7, 8, 9}}


Output : Row-wise: 1 2 3 4 5 6 7 8 9
         Col-wise : 1 4 7 2 5 8 3 6 9
*/
public class RowColTraverse {


    public static void RC(int size,int[][] arr){


        int colIndex = 0;
        int[] rowElements = new int[size*size];
        int[] colElements = new int[size*size];

        int rowindex =0;
        int rowLength = arr.length;
        int colLength = arr[0].length;

        for(int row = 0;row<rowLength;row++){

            for(int col = 0;col<colLength;col++){
                rowElements[rowindex++] = arr[row][col];
            }
        }

        int colindex = 0;

        for(int col = 0;col<colLength;col++){
            for(int row = 0;row<rowLength;row++){

                colElements[colindex++] = arr[row][col];

            }
        }

        System.out.println(Arrays.toString(rowElements));
        System.out.println(Arrays.toString(colElements));
    }


    public static void main(String[] args) {

        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        int[] a3 = {7, 8, 9};
        int[][] matrix = {a1,a2,a3};
        RC(3,matrix);

    }
}
