package FileHandling.Writer;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteOnConsole {

    public static void main(String[] args) {
        writeOnConsole();
    }
    public static void writeOnConsole(){

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){

            osw.write("Hello Sanatan");
            osw.write(103);
            osw.write('B');
            char[] data = "Tathva masi".toCharArray();
            osw.write(data);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
