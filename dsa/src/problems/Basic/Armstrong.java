package problems.Basic;

//to extract value in the char use Character.getNumericData();
/*
num = 371
number of digits are 3
 */
public class Armstrong {

    public static boolean armStrong(int number){

        String num = Integer.toString(number);
        int sum = 0;
        int size = num.length();
        for(int i = 0;i<size;i++){
            char a = num.charAt(i);
            int digit = Character.getNumericValue(a);
            sum += Math.pow(digit,size);

        }
       return number == sum;

    }

    public static void main(String args[]){
        System.out.println(armStrong(371));
    }
}
