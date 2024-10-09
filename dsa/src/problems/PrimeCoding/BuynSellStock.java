package problems.PrimeCoding;

public class BuynSellStock {





    //Time Complexity is O(n)
    public static int getMaxProfit(int[] stockPrices){

        int maxProfit = Integer.MIN_VALUE;

        int minValue = stockPrices[0];

        for(int i = 1;i<stockPrices.length;i++){

            if(stockPrices[i]<minValue){
                minValue = stockPrices[i];
            }else{

                int profit = stockPrices[i]-minValue;

                maxProfit = Integer.max(profit,maxProfit);
            }
        }

        return maxProfit;
    }

    public static int getMaxProfit2(int[] prices){

        int maxProfit = Integer.MIN_VALUE;

        for(int buyIndex = 0;buyIndex<prices.length-1;buyIndex++){

            for(int sellIndex = buyIndex+1;sellIndex<prices.length;sellIndex++){

                int profit = prices[sellIndex]- prices[buyIndex];

                maxProfit = Integer.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){

        int arr[] = {7,1,5,3,6,4};
        System.out.println(getMaxProfit(arr));


    }
}
