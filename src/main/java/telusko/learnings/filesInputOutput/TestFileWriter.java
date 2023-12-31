package telusko.learnings.filesInputOutput;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestFileWriter {
    public static void main(String[] args) {

        String separator = File.separator;
        String current = System.getProperty("user.dir");

        String location = current + separator + "src";
        File f = new File(location, "/newText.txt");
        try {
            FileWriter fw = null;
            FileReader fr = null;
            try {
                fw = new FileWriter(f);
                fw.write(65);
                fw.write("\n");
                fw.write("Java");
                fw.write("\n");
                fw.close();
                System.out.println("done writing");

            } finally {
                fw.close();
            }

            try{
                fr = new FileReader(f);
                int i = fr.read();
              while(i!=-1){
                  System.out.println((char)i);
                  i = fr.read(); // we are writing this because we need to move our cursor
                  // from first character to next one, as File Reader will read only one
                  // character at a time we need to use this method to check if all the
                  // characters are read in the file, once all characters are read then read()
                  // will write -1 as a value and we are checking our loop till the value is -1 then loop will terminate
              }
            } finally {
                fr.close();
            }

            try{
                fr = new FileReader(f);
                char[] ch = new char[(int) f.length()];
                fr.read(ch);
                for(char c: ch){
                    System.out.println(c);
                }

            } finally {
                fr.close();
            }

            f.delete();
            System.out.println(f.exists());
            System.out.println("done executing");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
