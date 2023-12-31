package telusko.learnings;


import lombok.*;


@Data
@NoArgsConstructor
class ProjectLombok{

    @NonNull
    int lombok_number;
    @NonNull
    String lombok_name;

}
public class TestProjectLombok {

    public static void main(String[] args) {

        ProjectLombok pl = new ProjectLombok();

        pl.setLombok_name("as123");
        String s = pl.getLombok_name();
        //System.out.println(pl.toString());

//        pl.setLombok_name("ABC");
        System.out.println(s);

    }


}
