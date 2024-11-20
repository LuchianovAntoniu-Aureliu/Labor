package Repository;

public interface IRepo<T> {
    void create(T obj);
    T read(int ID);
    void update(int ID, T obj);
    void delete(int ID);
}
//Definitia operatiilor CRUD in interfata IRepo.