package lviv.first.Dao;

import lviv.first.entity.Users;


public interface UsersDao extends AbstractDao<Users> {
    public Users findByUsername(String username);
}
