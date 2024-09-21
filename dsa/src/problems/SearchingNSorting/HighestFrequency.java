package problems.SearchingNSorting;


import java.util.HashMap;

/*
return the most repeated character in the string

 */
public class HighestFrequency{

    public static String highestFrequency(String string){

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(char i:string.toCharArray()){

            if(hashMap.containsKey(i)){
                //Adding data to the HashMap
                hashMap.put(i, hashMap.get(i)+1);
            }else{
                //Updating the value for the key(character)
                hashMap.put(i,1);
            }
        }

        int maxFreq = 0;

        //Iterating through the hashmap
       for(int freq: hashMap.values()){
           if(freq>maxFreq){
               maxFreq = freq;
           }
       }
       StringBuilder result = new StringBuilder();
       // returning all the maxV
       for(char x: hashMap.keySet()){
           if(hashMap.get(x) == maxFreq){
               result.append(x);
           }
       }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(highestFrequency("abdefgbabfba"));
        System.out.println(highestFrequency("xxyy"));
    }
}
