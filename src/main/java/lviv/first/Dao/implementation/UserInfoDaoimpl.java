package lviv.first.Dao.implementation;

import lviv.first.Dao.UsersInfoDao;
import lviv.first.entity.UserInfo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserInfoDaoimpl extends AbstractDaoimpl<UserInfo> implements UsersInfoDao {

    @PersistenceContext(unitName = "task")
    private EntityManager entityManager;


    @Transactional
    @SuppressWarnings(value = "unchecked")
    public List<UserInfo> findByName(String firstName) {
        return entityManager.createNamedQuery("UserInfo.findByName").setParameter("firstName", firstName).getResultList();
    }

    @Transactional
    @SuppressWarnings(value = "unchecked")
    public List<UserInfo> findByTwoName(String firstName, String lastName) {
        return entityManager.createNamedQuery("UserInfo.findByTwoName").setParameter("firstName", firstName).setParameter("lastName", lastName).getResultList();
    }

    @Transactional
    public UserInfo findByUsername(String username) {
        return (UserInfo) entityManager.createNamedQuery("UserInfo.findByUsername").setParameter("username", username).getSingleResult();
    }

    @Transactional
    @Override
    public void add(UserInfo entity) {
        super.add(entity);
    }

    @Transactional
    @Override
    public void edit(UserInfo entity) {
        super.edit(entity);
    }

    @Transactional
    @Override
    public void delete(UserInfo entity) {
        super.delete(entity);
    }

    @Transactional
    @Override
    public List<UserInfo> getAll() {
        return super.getAll();
    }

    @Override
    public UserInfo findById(int id) {
        return super.findById(id);
    }
}
