package telusko.learnings.collections.comparator;

public class StudentDetails {

    private String name;
    private int id;
    private int age;


    public StudentDetails(String name){
        this.name = name;
        id = 10;
        age = 20;
    }

    public StudentDetails(String name, int id){
        this.name = name;
        this.id = id;
        age = 21;
    }

    public StudentDetails(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "name - "+name + " : "+ "age - "+age + " : "+ "id -"+ id;
    }

}
