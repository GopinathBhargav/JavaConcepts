package telusko.learnings.filesInputOutput;

import java.io.*;

class StudentClass implements Serializable{

    int rollNO;
    String name;
    transient int age; // this variable dont participate in serialization

    public StudentClass(int rollNO, String name, int age) {
        this.rollNO = rollNO;
        this.name = name;
        this.age = age;
    }

    public String display(){
        return "name - "+name + ", rollNo - "+rollNO+", age - "+age;
    }

}

public class TestSerialization {

    public static void main(String[] args) {

        String separator = File.separator;

        File file = new File(separator+"Users" + separator+"gopinath.b"+separator+"IdeaProjects"+
                separator+"javaConcepts"+separator+"src"+separator+"newTestSerialization.txt");

        StudentClass sc = new StudentClass(23, "Apple", 24);

        try {
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(sc);
            oos.close();
            bos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            StudentClass st = (StudentClass) ois.readObject();
            System.out.println(st.display()); // name - Apple, rollNo - 23, age - 0 --> age value is 0 because we kept transient for age variable,
            // when we use transient it won't participate in serialization, therefore whenever we deconstruct the object using deserialization
            // the value of the variable give default value of data type for example if its string it gives null and for int its 0

            file.delete();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
