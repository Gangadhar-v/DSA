package FileHandling.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderForFile {

    public static void main(String[] args) {
        readFile();
    }
    public static void readFile(){

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ganga\\IdeaProjects\\DSA\\dsa\\src\\FileHandling\\note.txt"))){

            while(br.ready()){
                String data = br.readLine();
                System.out.print(data);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
