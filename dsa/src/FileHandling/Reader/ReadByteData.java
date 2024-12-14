package FileHandling.Reader;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReadByteData {

    public static void main(String args[]){
        readByteDataFromKeyBoard();
    }
    public static void readByteDataFromKeyBoard(){

        //taking byte form data form keyboard
        try(InputStreamReader isr = new InputStreamReader(System.in)){

            System.out.print("Enter some data");
            int letter = isr.read();
            while(isr.ready()){  //checking if it is ready to read
                System.out.println(letter);
                letter = isr.read();
            }
            isr.close();  //isr releases all the resource associated with it
            System.out.println();

        }catch(IOException e){
            System.out.println("An exception occured"+e.getMessage());
        }
    }
}
