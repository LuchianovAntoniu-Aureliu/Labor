package Model;
import java.util.List;
import java.util.ArrayList;

public class Student extends Persoana {
    private int IDStudent;
    private List<Curs> curs;
    private int[] note;
    //Atributele de baza a clasei Student.
    public Student(String nume, String prenume, int IDStudent, int[] note, List<Curs> curs) {
        super(nume, prenume);
        this.IDStudent = IDStudent;
        this.curs = curs;
        this.note = note;
    }
    //Constructorul clasei Student.

    public int get_IDStudent() {
        return IDStudent;
    }
    //Returneaza ID-ul unui Student.

    public void set_IDStudent(int IDstudent) {
        this.IDStudent = IDstudent;
    }
    //Scrie ID-ul unui Student.Primeste ca paramertru un numar intreg.

    public List<Curs> get_curs() {
        return curs;
    }
    //Returneaza cursurile la care este inscris un student.

    public void set_curs(List<Curs> curs) {
        this.curs = curs;
    }
    //Scrie cursurile la care este inscris un student..Primeste ca parametru o lista de cursuri.

    public int[] get_note() {
        return note;
    }
    //Returneaza notele unui student.
    public void set_note(int[] note) {
        this.note = note;
    }
    //Scrie notele unui student.Primeste ca parametru o lista de numere intregi.
}
