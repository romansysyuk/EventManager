package lviv.first.Service;

import lviv.first.entity.Users;

import java.util.List;


public interface UsersService {

    public void add(String username, String password);

    public void edit(int id, String username, String password);

    public void delete(int id);

    Users findUserById(int id);

    List<Users> findUserByUsername(String username);


}
