package Model;
import java.util.List;

public class Profesor extends Persoana {
    private int IDProfesor;
    //Atributele de baza a clasei Profesor.

    public Profesor(String nume, String prenume, int IDProfesor) {
        super(nume, prenume);
        this.IDProfesor = IDProfesor;
    }
    //Constructorul clasei Profesor.

    public void set_IDProfesor(int IDprofesor) {
        this.IDProfesor = IDprofesor;
    }
    //Scrie ID-ul unui profesor.Primeste ca parametru un numar intreg.
}
