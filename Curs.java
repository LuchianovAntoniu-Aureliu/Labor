package Model;
import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String nume_curs;
    private Profesor profesor;
    private int max_studenti;
    protected List<Student> inscrisi = new ArrayList<>();
    private int numar_locuri;
    private int media;
    //Atribute de baza a clasei Curs.

    public Curs(String nume_curs, Profesor profesor, int max_studenti, int media) {
        this.nume_curs = nume_curs;
        this.profesor = profesor;
        this.max_studenti = max_studenti;
        this.numar_locuri = max_studenti;
        this.media = media;
    }
    //Constructorul clasei Curs.

    public String get_nume_curs() {
        return nume_curs;
    }
    //Returneaza numele unui curs.

    public void set_nume_curs(String nume_Curs) {
        this.nume_curs = nume_Curs;
    }
    //Scrie numele unui curs.Primeste ca parametru o variabila String.

    public Profesor get_profesor() {
        return profesor;
    }
    //Returneaza profesorul unui curs.

    public void set_profesor(Profesor Profesor) {
        this.profesor = Profesor;
    }
    //Scrie numele unui profesor a unui urs.Primeste ca parametru un profesor.

    public int get_max_studenti() {
        return max_studenti;
    }
    //Returneaza numarul maxim de studenti a unui curs.

    public void set_max_studenti(int max_Studenti) {
        this.max_studenti = max_Studenti;
    }
    //Scrie numarul maxim de studenti a unui curs.Primeste ca parametru un numar intreg.

    public List<Student> get_studenti_inscrisi() {
        return inscrisi;
    }
    //Returneaza numarul de studenti inscrisi a unui curs.

    public void set_studenti_inscrisi(List<Student> Inscrisi) {
        this.inscrisi = Inscrisi;
    }
    //Scrie numarul de studenti inscrisi a unui curs.Primeste ca parametru un numar intreg.

    public int get_numar_locuri() {
        return numar_locuri;
    }
    //Returneaza numarul de locuri a unui curs.

    public void set_numar_locuri(int numar_Locuri) {
        this.numar_locuri = numar_Locuri;
    }
    //Scrie numarul de locuri a unui curs.Primeste ca parametru un numar intreg.

    public void inscrie_student(Student student) {
        inscrisi.add(student);
    }
    //Inscrie studentul la un curs.Primeste ca parametru un  student.

    public int get_media() {
        return media;
    }
    //Returneaa media necesara pentru promovarea unui curs.
    public void set_media(int media) {
        this.media = media;
    }
    //Scrie media necesara pentru promovarea unui curs.Primeste ca parametru un numar intreg.
}
