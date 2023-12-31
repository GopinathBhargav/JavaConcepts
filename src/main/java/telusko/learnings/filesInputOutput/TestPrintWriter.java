package telusko.learnings.filesInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestPrintWriter {
    public static void main(String[] args) {

        String separator = File.separator;

        String current = System.getProperty("user.dir");
        File file = new File(current +separator+"src"+separator+"newTestBuffered.txt");

        try {
            PrintWriter write = new PrintWriter(file);
            write.println(45);
            write.println('C');
            write.println("ABC");
            write.println(45.5);
            write.println(45.23f);
            write.close();
            file.delete();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
