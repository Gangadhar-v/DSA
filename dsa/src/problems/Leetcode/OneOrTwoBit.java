package problems.Leetcode;


/*
PROBLEM STATEMENT
one-bit character (0) : Represented by single bit 0.
Two-bit character (10 or 11): Represented by single bit (10 or 11)

Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character.
Example 2:

Input: bits = [1,1,1,0]
Output: false
Explanation: The only way to decode it is two-bit character and two-bit character.

if the last bit is '0', true only it is part of single bit i.e; 0 bit
if the last bot is '0', false when it is part of two bit i.e;  10 bits

 */
public class OneOrTwoBit {

    public static boolean oneOrTwoBit(int[] bits){

        int size = bits.length;

        for(int i = 0;i<bits.length-1;i++){

            if(bits[i] == 1){

            }
        }
        int index = 0;
        while(index<size-1){
            if(bits[index] == 1){
                index = index+2;
            }else{
                index++;
            }
        }

        return index == size-1;

    }


    public static void main(String[] args) {

        int[] bits = {1,1,1,0};
        System.out.println(oneOrTwoBit(bits));
    }
}

/*
APPROACH
if the current bit is 1, then next bit either 1 or 0, definitely they will become part of two bit

find the index of last one bit in array, return true if that index is last index


 */
