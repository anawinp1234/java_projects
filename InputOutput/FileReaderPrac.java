import java.io.FileReader;
import java.io.IOException;
public class FileReaderPrac {
    public static void main(String[] args) throws IOException {
        //Store fileName to variable
        String fileName = "file.txt";
        // declare and initialize FileReader
        FileReader reader = new FileReader(fileName);
        // An example of how an absolute path may look is: 
        // FileReader input = new FileReader("C:/SampleFolder/input.txt");
        // An example of how a relative path may look is: 
        // FileReader input = new FileReader("../documents/SampleFolder/input.txt");
        
        //reading the file
        while (reader.ready()) {
            System.out.print((char)reader.read());
        }

        //close the reader
        reader.close();
    }
}
// // can write this way as well
// int counter = 0;
// while ((counter = reader.read()) != -1) {
//     System.out.print((char) counter);
// }