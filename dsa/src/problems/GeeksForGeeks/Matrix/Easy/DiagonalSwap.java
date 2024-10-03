package problems.GeeksForGeeks.Matrix.Easy;


import java.util.Arrays;

/*
PROBLEM STATEMENT

major diagonal -> 0,4,8
minor diagonal -> 2,4,6
Input : 0 1 2
        3 4 5
        6 7 8

Output : 2 1 0
         3 4 5
         8 7 6


 */
public class DiagonalSwap {

    public static void swapDiagonal(int[][] matrix){

        int N = matrix.length;
        for(int i = 0;i<N;i++){

            int m = matrix[i][i];
            matrix[i][i] = matrix[i][N-1-i];
            matrix[i][N-1-i] = m;
        }

        System.out.println(Arrays.deepToString(matrix));

    }
    public static void main(String args[]){
        int[] a = {0,1,2};
        int[] b = {3,4,5};
        int[] c = {6,7,8};

        int[][] matrix = {a,b,c};
        swapDiagonal(matrix);
    }

}
