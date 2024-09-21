package problems;

public class BitsRearrangement {
    /*
    1.convert the integer to binary form
    2.find the number of set bits in binary number
    3.arrange the set bits in consecutive, to get the minimum number
     */

    static int bitArrangement(int num){

       //to convert int to binary value -> String binaryValue = Integer.toBinaryString(num);
        int setBitsCount = Integer.bitCount(num);

        int resultNumber =0;
        for( int i = 0; i<setBitsCount; i++){
            resultNumber+= (int) Math.pow(2,i);
        }

        return resultNumber;
    }

    public static void main(String args[]){
        System.out.println(bitArrangement(10));
    }
}
