import java.util.List;
import Model.Curs;
import Model.Student;
import Model.Profesor;
import Repository.CursRepository;
import Repository.StudentRepository;
import Service.Domain;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CursRepository curs_repository = new CursRepository();
        StudentRepository student_repository = new StudentRepository();
        Domain domain = new Domain(curs_repository, student_repository);
        Profesor profesor1 = new Profesor("Ion", "Popescu", 1);
        Profesor profesor2 = new Profesor("Rares", "Petru", 2);
        Curs curs1 = new Curs("Pian", profesor1, 20, 5);
        Curs curs2 = new Curs("Chitara", profesor2, 15, 5);
        curs_repository.create(curs1);
        curs_repository.create(curs2);
        Student student1 = new Student("Dan", "Dumitru", 101, new int[]{10, 9, 8}, new ArrayList<>());
        Student student2 = new Student("Bogdan", "Moara", 102, new int[]{4, 3, 2}, new ArrayList<>());
        student_repository.create(student1);
        student_repository.create(student2);
        domain.este_promovat(student1, curs1);
        domain.este_promovat(student2, curs2);
        System.out.println("Cursuri disponibile:");
        List<Curs> cursuri_disponibile = domain.get_cursuri_disponibile();
        for (Curs curs:cursuri_disponibile) {
            System.out.println(curs.get_nume_curs() + " locuri disponibile: " + curs.get_numar_locuri());
        }
        System.out.println("\nStudenti inscrisi:");
        List<Student> studenti_inscrisi_curs1 = domain.get_studenti_inscrisi(curs1);
        System.out.println("Curs " + curs1.get_nume_curs());
        for (Student student:studenti_inscrisi_curs1) {
            System.out.println("-" + student.get_nume() + " " + student.get_prenume());
        }
        List<Student> studenti_inscrisi_curs2 = domain.get_studenti_inscrisi(curs2);
        System.out.println("Curs " + curs2.get_nume_curs());
        for (Student student:studenti_inscrisi_curs2) {
            System.out.println("-" + student.get_nume() + " " + student.get_prenume());
        }
        domain.remove_student(student1, curs1);
        System.out.println("\nCursuri dupa eliminarea unui student:");
        cursuri_disponibile = domain.get_cursuri_disponibile();
        for (Curs curs:cursuri_disponibile) {
            System.out.println(curs.get_nume_curs() + " locuri disponibile " + curs.get_numar_locuri());
        }
    }
}