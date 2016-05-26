package lviv.first.Service.impl;

import lviv.first.Dao.UsersDao;
import lviv.first.Service.UsersService;
import lviv.first.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UsersServiceimpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Transactional
    public void add(String username, String password) {
        Users users = new Users(password, username);
        usersDao.add(users);
    }

    @Transactional
    public void edit(int id, String username, String password) {
        usersDao.findById(id);
        Users users = new Users();

        if (username != null) {
            users.setUsername(username);
        }

        if (password != null) {
            users.setPassword(password);
        }
        usersDao.edit(users);

    }

    @Transactional
    public void delete(int id) {
        Users users = usersDao.findById(id);
        usersDao.delete(users);


    }

    @Transactional
    public Users findUserById(int id) {
        return usersDao.findById(id);
    }

    @Transactional
    public List<Users> findUserByUsername(String username) {
        return (List<Users>) usersDao.findByUsername(username);
    }
}
