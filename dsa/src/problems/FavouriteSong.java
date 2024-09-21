package problems;

import java.util.ArrayList;

public class FavouriteSong {
    //return the subString of length k with max char 'a'

    static int subSongs(String songs,int k){
        int count = 0;
        ArrayList<String> result = new ArrayList<>();
        for(int i =0;i<=songs.length()-k;i++) {
            long c = songs.substring(i, i + k).chars().filter(it -> it == 'a').count();
            if ((int) c > count){
                count = (int) c;
            }else{
                continue;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(subSongs("abacaa",4));
    }
}
