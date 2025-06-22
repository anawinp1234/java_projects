
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterPrac {
    public static void main(String[] args) throws IOException {
        // passing the name of the file into FileWriter
        FileWriter output = new FileWriter("FileWriterFile.txt");
        
        // writing the content of the new file
        String textInFile = "Hello! I am the text you are putting into the new file!";
        
        //using write() to write the text into the new file
        output.write(textInFile);

        //close the writer
        output.close();
    }
}