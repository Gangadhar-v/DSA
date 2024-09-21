package problems.Arrays.Easy;


import java.util.Arrays;


public class TotalPaintingCost {

    static float calculateCost(int M, int N, float[] areas){

        if(M+N > areas.length){
            throw new IllegalArgumentException("the sum of M and N exceeds the length of the areas arrays.");
        }
        float[] interiorWallsArea = Arrays.copyOfRange(areas,0,M);
        float[] exteriorWallsArea = Arrays.copyOfRange(areas,M,M+N);

        float interiorPaintcost = 0;
        for( float area: interiorWallsArea ){
            interiorPaintcost+=area*20;
        }
        float exteriorPaintCost = 0;
        for( float area:exteriorWallsArea){
            exteriorPaintCost += area*15;
        }


        return  (interiorPaintcost+exteriorPaintCost);
    }

    public static void main(String[] args) {
        float area[] = {66.3f, 55.2f, 99.9f, 100f, 93.6f, 12.4f, 8.6f};
        System.out.println(calculateCost(4,
                3,area));
    }
}
