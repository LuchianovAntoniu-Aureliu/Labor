package Repository;
import Model.Student;
import Model.Curs;
import java.util.List;
import java.util.ArrayList;

public class StudentRepository extends Repo<Student> {
    public List<Student> find_student(Curs curs) {
        List<Student> curs_student = new ArrayList<>();
        for (Student student:data.values()) {
            if (student.get_curs().contains(curs)) {
                curs_student.add(student);
            }
        }
        return curs_student;
    }
}
//Returneaza un student inscris la un curs.Primeste ca parametru  un obiect de tip Curs.
