package problems.SearchingNSorting;

/*
 abet, beknow, biopsy, cot, den, etc.
All the letters in these word are appearing in the alphabetical order.
 */
public class Abecedarian {

    /*
    solution if ascii value of first char is greater than second one, then return false
    a = 97 b = 98 c=99 d = 100
    A = 65 B = 66

     */
    public static boolean isAbecidarian(String string){

        int length = string.length();
        for(int i = 0;i<length-1;i++){
            if(string.charAt(i) > string.charAt(i+1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAbecidarian("brown"));
    }
}
