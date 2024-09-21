package problems.Arrays.Easy.Medium;

import java.util.HashMap;
import java.util.List;

public class FindError {

    public static int findError(int N, int M, List<String> Products,List<Float> Product_Prices, List<String> Products_Sold, List<Float> SoldPrices){

        int error = 0;
        HashMap<String,Float> hashMap = new HashMap<>();
        int index = 0;
        for(Float productPrice:Product_Prices){
            hashMap.put(Products.get(index++),productPrice );
        }
        for(int j = 0;j<M;j++){

            String soldProduct = Products_Sold.get(j);
            Float soldPrice = SoldPrices.get(j);

            Float correctPrice = hashMap.get(soldProduct);

            if(!soldPrice.equals(correctPrice)){
                error=error+1;
            }
        }

      return error;

    }
    public static void main(String args[]){
        List<Float> prices = List.of(2.89f,3.29f,5.79f);
        List<String> products = List.of("pencils","pen","rubber");
        List<String> product_sold = List.of("pencils","pencils","pen","rubber");
        List<Float> sold_prices = List.of(2.89f,2.99f,5.79f,3.29f);
        System.out.println(findError(3,4,products,prices,product_sold,sold_prices));
    }
}
