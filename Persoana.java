package Model;
import java.util.List;

abstract class Persoana {
    protected String nume;
    protected String prenume;
    //Atributele de baza a clasei Persoana.

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
    //Constructorul clasei Persoana.

    public String get_nume() {
        return nume;
    }
    //Returneaza numele unei persoane.

    public String get_prenume() {
        return prenume;
    }
    //Returneaza prenumele unei persoane.

    public void set_nume(String nume) {
        this.nume = nume;
    }
    //Scrie numele unei persoane.Primeste ca parametru o variabila String.

    public void set_prenume(String prenume) {
        this.prenume = prenume;
    }
    //Scrie prenumele unei persoane.Primeste ca parametru o variabila String.
}
