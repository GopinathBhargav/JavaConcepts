package telusko.learnings.filesInputOutput;

import java.io.*;
import java.util.stream.Stream;

public class TryWithResources {

        public static void main(String[] args) {

            String separator = File.separator;
            String current = System.getProperty("user.dir");

            File file = new File(current+separator+"src"+separator+"newTestBuffered.txt");

            try {
                file.createNewFile(); //to create the new file

               // FileWriter fWriter = new FileWriter(file);
                //BufferedWriter buffWriter = new BufferedWriter(fWriter);

                try(BufferedWriter buffWriter = new BufferedWriter(new FileWriter(file))){
                    buffWriter.write("Java");
                    buffWriter.newLine();
                    buffWriter.write(65);
                }
//                finally {
//                    buffWriter.close();
//                    fWriter.close();
//                }
//                FileReader fReader = new FileReader(file);
//                BufferedReader buffReader = new BufferedReader(fReader);

                try(BufferedReader buffReader = new BufferedReader(new FileReader(file))) {
                    Stream<String> lines = buffReader.lines();
                    lines.forEach(i -> System.out.println(i));
                }
//                finally {
//                    buffReader.close();
//                    fReader.close();
//                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
