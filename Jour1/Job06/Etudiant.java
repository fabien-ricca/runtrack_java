import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Etudiant {
    private String name;
    private List<Integer> notes = new ArrayList<>();

    public Etudiant(String name){
        this.name = name;

        notes.add(15);
        notes.add(12);
        notes.add(18);
        notes.add(10);

        Collections.sort(this.notes);
    }

    public void displayName(){
        System.out.println("Nom de l'étudiant : " + this.name);
    }

    public void displayNotes(){
        String str = "";

        for(int nb : this.notes){
            str += String.valueOf(nb) + ", ";
        }

        str = str.substring(0, str.length() - 2);
        System.out.println("Notes : [" + str + "]");
    }

    public void noteMin(){
        System.out.println("Note la plus basse : " + notes.get(0));
    }

    public void noteMax(){
        System.out.println("Note la plus haute : " + notes.get(notes.size() - 1));
    }

    public void moyenne(){
        double somme = 0;
        int nbNotes = this.notes.size();

        for(int nb : this.notes){
            somme += nb;
        }
        double moyenne = somme / nbNotes;

        System.out.println("Moyenne : " + moyenne);
    }
}
