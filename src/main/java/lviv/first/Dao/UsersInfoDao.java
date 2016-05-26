package lviv.first.Dao;

import lviv.first.entity.UserInfo;

import java.util.List;


public interface UsersInfoDao extends AbstractDao<UserInfo>{

    public List<UserInfo> findByName(String firstName);

    public List<UserInfo> findByTwoName(String firstName, String lastName);

    public UserInfo findByUsername(String username);

}
