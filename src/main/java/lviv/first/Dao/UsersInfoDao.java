package lviv.first.Dao;

import lviv.first.entity.UserInfo;
import lviv.first.entity.Users;

import java.util.List;

/**
 * Created by kobeb on 24.05.2016.
 */
public interface UsersInfoDao extends AbstractDao<UserInfo>{

    public List<UserInfo> findByName(String name);

    public List<UserInfo> findByTwoName(String firstName, String lastName);

    public UserInfo findByUsername(String username);

}
