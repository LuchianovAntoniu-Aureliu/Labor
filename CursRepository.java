package Repository;
import Model.Curs;
import Model.Profesor;
import java.util.List;
import java.util.ArrayList;

public class CursRepository extends Repo<Curs> {
    public List<Curs> find_curs(Profesor profesor) {
        List<Curs> curs_profesor = new ArrayList<>();
        for (Curs curs:data.values()) {
            if (curs.get_profesor().equals(profesor)) {
                curs_profesor.add(curs);
            }
        }
        return curs_profesor;
    }
    //Returneza cursurile predate de catre un profesor.Primeste ca parametru un profesor.
    public List<Curs> get_toate_cursurile() {
        return new ArrayList<>(data.values());
    }
    //Returneaza toate cursurile.
}

