package lviv.first.Dao.implementation;

import lviv.first.Dao.UsersDao;
import lviv.first.entity.Users;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by kobeb on 24.05.2016.
 */
@Repository
public class UsersDaoimpl extends AbstractDaoimpl<Users> implements UsersDao {

    @PersistenceContext(unitName = "task")
    private EntityManager entityManager;

@Transactional
    public Users findByUsername(String username) {
        return (Users) entityManager.createNamedQuery("Users.findByUsername").setParameter("username",username).getSingleResult();
    }
@Override
@Transactional
    public void add(Users users) {
        entityManager.persist(users);

    }

    @Override
@Transactional
    public void edit(Users users) {
        entityManager.merge(users);

    }

    @Override
@Transactional
    public void delete(Users users) {
        entityManager.remove(users);

    }
    @Override
@Transactional
    public List<Users> getAll() {
        return (List<Users>) entityManager.createQuery("from Users ").getResultList();
    }
}
