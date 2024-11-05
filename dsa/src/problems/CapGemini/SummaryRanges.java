package problems.CapGemini;

/*PROBLEM STATEMENT
input ->{0,1,2,4,6,7}
output ->
0->2
4
6->7

 */
public class SummaryRanges {


    public static void approach1(int[] arr){

        if(arr.length == 0) return;

        int startRange = 0;

        for(int i = 1;i<arr.length;i++){

            if(arr[i] - arr[i-1] != 1){

                if(startRange == i-1){
                    System.out.println(arr[startRange]);
                }else{

                    System.out.println(arr[startRange]+"->"+arr[i-1]);
                }

                startRange = i;
            }
        }

        if(startRange == arr.length -1){
            System.out.println(arr[startRange]);
        }else{
            System.out.println(arr[startRange] +"->"+arr[arr.length-1]);
        }

    }
    
    public static void approach2(int[] arr){


        int startRange = 0;
        int currentRange = 0;
        int count = 0;



       for(int i = 1;i<arr.length;i++){

           if(arr[i] - arr[currentRange] == 1){
               currentRange++;
               count++;
           }else{

               if(count==0){
                   System.out.println(arr[startRange]);
               }else{
                   System.out.println(arr[startRange]+"->"+arr[currentRange]);
               }

               count = 0;
               startRange = i;
               currentRange=i;
           }
       }

       if(count>0) {
           System.out.println(arr[startRange] + "->" + arr[currentRange]);
       }else{
           System.out.println(arr[startRange]);
       }

    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,6,7,10,11,12,13};
        approach2(arr);
    }
}
