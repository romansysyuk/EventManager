package lviv.first.Dao.implementation;

import lviv.first.Dao.AbstractDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AbstractDaoimpl<E> implements AbstractDao<E> {

    @PersistenceContext(unitName = "task")
    EntityManager entityManager;

    @Transactional
    @SuppressWarnings("unchecked")
    public E findById(int id) {
        return (E) entityManager.find(getClass(), id);
    }

    @Transactional
    public void add(E entity) {
        entityManager.persist(entity);

    }

    @Transactional
    public void edit(E entity) {
        entityManager.merge(entity);

    }

    @Transactional
    public void delete(E entity) {
        entityManager.remove(entity);

    }

    @Transactional
    @SuppressWarnings(value = "unchecked")
    public List<E> getAll() {
        return (List<E>) entityManager.createQuery("from " + getClass().getCanonicalName()).getResultList();
    }
}
