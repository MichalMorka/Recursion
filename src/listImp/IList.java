package listImp;

public interface IList <T>{
    boolean isEmpty();
    int size();
    void add(T value); // dodaj na kolejne miejsce
    void add(T value, int index); // dodaj na dowolne miejsce np. w srodek
    T get(int index);
    void set(T value, int index);
    void  remove(int index);

}
