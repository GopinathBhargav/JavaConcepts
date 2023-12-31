package telusko.learnings.filesInputOutput;

import java.io.File;
import java.util.Arrays;

public class TestFileDemo {

    public static void main(String[] args) {

        String separator = File.separator;
        String location = System.getProperty("user.dir");

        File dir = new File(location + separator+"src"+separator+  "/testIndex");
        File file1 = new File(location+ separator+"src"+separator, "/testDemo1");
        try {
            dir.mkdir();
            file1.createNewFile();
            System.out.println("file separator is " + separator); // file separator is /
            String pathSeparator = File.pathSeparator;
            System.out.println("path separator is " + pathSeparator); // path separator is :
            char pathSeparatorChar = File.pathSeparatorChar;
            System.out.println("path separator char is " + pathSeparatorChar); // path separator char is :
            char separatorChar = File.separatorChar;
            System.out.println("separator char is " + separatorChar); // separator char is /
            String path = dir.getPath();
            System.out.println(path); // /Users/gopinath.b/IdeaProjects/javaConcepts/src/testIndex
            File txtFile = new File(path + "/index.txt");
            txtFile.createNewFile(); // to create a file in specified path
            System.out.println("check if it is a file: " + txtFile.isFile()); // check if it is a file: true
            System.out.println("check if file exists: " + txtFile.exists()); // check if file exists: true

            String[] list = dir.list();
            System.out.println(Arrays.stream(list).count()); // 1
            for(String listNames: list){
                System.out.println(listNames); //    index.txt
            }

            file1.delete();
            txtFile.delete();
            dir.delete();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
