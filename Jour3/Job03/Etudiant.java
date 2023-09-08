import java.util.HashMap;
import java.util.Map;

public class Etudiant {
    Map<Integer, String> studentList = new HashMap<Integer, String>();

    public Etudiant(String... names){
        int matricule = 100;

        for(String name : names){
            matricule += 1;
            studentList.put(matricule, name);
        }
    }

    public void displayStudentList(){
        studentList.forEach((matricule, nom) -> {
            System.out.println(matricule + ": " + nom);
        });
    }
}
