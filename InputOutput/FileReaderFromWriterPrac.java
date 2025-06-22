import java.io.FileReader;
import java.io.IOException;
public class FileReaderFromWriterPrac {
    public static void main(String[] args) throws IOException {
        String fileName = "FileWriterFile.txt";
        FileReader reader1 = new FileReader(fileName);

        int counter = 0;
        while ((counter = reader1.read()) != -1) {
            System.out.print((char)counter);
        }


        // while (reader1.ready()) {
        //     System.out.print((char)reader1.read());
        // }
        // reader1.close();
    }
}