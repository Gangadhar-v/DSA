package FileHandling.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {

    public static void main(String[] args) {
        writingInFile();
    }
    public static void writingInFile(){

        try(FileWriter fw = new FileWriter("C:\\Users\\ganga\\IdeaProjects\\DSA\\dsa\\src\\FileHandling\\Reader\\note.txt",true)){

            fw.write("this is appended data");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
