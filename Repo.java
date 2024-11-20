package Repository;
import java.util.HashMap;
import java.util.Map;

public class Repo<T> implements IRepo<T> {
    protected Map<Integer, T> data = new HashMap<>();
    private int curentID = 1;
    public void create(T obj) {
        data.put(curentID++, obj);
    }
    public T read(int ID) {
        return data.get(ID);
    }
    public void update(int ID, T obj) {
        if (data.containsKey(ID)) {
            data.put(ID, obj);
        }
        else {
            throw new IllegalArgumentException("Obiectul cu ID-ul " + ID + " nu exista.");
        }
    }
    public void delete(int ID) {
        data.remove(ID);
    }
}
//Implementarea operatiilor CRUD din interfata IRepo.