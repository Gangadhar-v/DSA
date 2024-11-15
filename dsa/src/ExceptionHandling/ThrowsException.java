package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
throws is used in method declaration,
to indicate that the method may throw exception
 */
public class ThrowsException {

    public static void main(String args[]){
        try{
            readFile("hello.txt");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void readFile(String fileName) throws IOException {

        BufferedReader br = new BufferedReader( new FileReader(fileName));

        String line = br.readLine();
        System.out.println(line);
        br.close();
    }
}
