package lviv.first.Dao;

import lviv.first.entity.Users;

/**
 * Created by kobeb on 24.05.2016.
 */
public interface UsersDao extends AbstractDao<Users> {
    public Users findByUsername(String username);
}
