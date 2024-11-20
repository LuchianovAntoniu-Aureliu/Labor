package Service;
import Model.Curs;
import Model.Student;
import Repository.CursRepository;
import Repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class Domain {
    private CursRepository curs_repo;
    private StudentRepository student_repo;
    private List<Student> studenti_inscrisi = new ArrayList<>();
    public Domain(CursRepository curs_repo, StudentRepository student_repo) {
        this.curs_repo = curs_repo;
        this.student_repo = student_repo;
    }
    //Constructorul de baza al clasei Domain.
    public boolean este_promovat(Student student, Curs curs) {
        if(curs.get_numar_locuri() > 0 && validare_note(student, curs)) {
            curs.get_studenti_inscrisi().add(student);
            student.get_curs().add(curs);
            curs.set_numar_locuri(curs.get_numar_locuri() - 1);
            //student.set_note(student.get_note() + curs.get_media());
            return true;
        }
        return false;
    }
    //Verifica daca un student promoveaza cursuul cu notele pe care le are. Primeste ca
    //parametru studentul si cursul la care este inscris.
    public List<Curs> get_cursuri_disponibile() {
        return curs_repo.get_toate_cursurile().stream().
                filter(curs -> curs.get_numar_locuri() > 0).toList();
    }
    //Returneaza cursurile care au locuri disponibile.
    public List<Student> get_studenti_inscrisi(Curs curs) {
        if (curs.get_studenti_inscrisi() == null) {
            curs.set_studenti_inscrisi(new ArrayList<>());
            //studenti_inscrisi = new ArrayList<>();
        }
        return curs.get_studenti_inscrisi();
    }
    //Returneaza studentii inscrisi la un curs. Primeste ca parametru un obiect de tip Curs.
    public boolean remove_student(Student student, Curs curs) {
        if(curs.get_studenti_inscrisi().contains(student)) {
            curs.get_studenti_inscrisi().remove(student);
            student.get_curs().remove(curs);
            curs.set_numar_locuri(curs.get_numar_locuri() + 1);
            //student.set_note(student.get_note() - curs.get_media());
            return true;
        }
        return false;
    }
    //Sterge un student de la un curs. Primeste ca parametru un obiect de tip Student si un obiect
    //de tip Curs.
    public boolean validare_note(Student student, Curs curs) {
        /*
        int total_note = student.get_note();
        int limita = 5;
        return total_note >= limita;
        */
        int total_note = 0;
        for (int i = 0; i < student.get_note().length; i++) {
            total_note += student.get_note()[i];
        }
        total_note /= student.get_note().length;
        return total_note >= curs.get_media();
    }
    //Callculeaza media aritmetica a notelor unui student la un curs. Primeste ca parametru studentul
    //si cursul.
}
