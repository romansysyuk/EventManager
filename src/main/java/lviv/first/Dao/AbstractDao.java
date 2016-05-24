package lviv.first.Dao;

import java.util.List;

/**
 * Created by kobeb on 24.05.2016.
 */
public interface AbstractDao<E> {

    public void add(E entity);

    public void edit(E entity);

    public void delete(E entity);

    public List<E> getAll();
}
