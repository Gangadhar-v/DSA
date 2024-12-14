package FileHandling.Reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderForChar {

    public static void main(String args[]){
        fileReader();
    }
    public static void fileReader(){

        try(FileReader fr = new FileReader("C:\\Users\\ganga\\IdeaProjects\\DSA\\dsa\\src\\FileHandling\\note.txt")){

            int data = fr.read();
            while(fr.ready()){
                System.out.print((char) data);
                data = fr.read();
            }
            System.out.print((char) data);
        }catch(IOException e ){
            System.out.println(e.getMessage());
        }
    }
}
