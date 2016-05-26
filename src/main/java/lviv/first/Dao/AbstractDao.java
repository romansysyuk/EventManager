package lviv.first.Dao;

import java.util.List;


public interface AbstractDao<E> {

    public E findById(int id);

    public void add(E entity);

    public void edit(E entity);

    public void delete(E entity);

    public List<E> getAll();
}
