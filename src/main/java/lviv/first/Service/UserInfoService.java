package lviv.first.Service;

import lviv.first.entity.UserInfo;

import java.util.Date;
import java.util.List;


public interface UserInfoService {
    public void add(String firstName, String lastName, Date dateEvent, String eMail, String username);

    public void edit(int id, String firstName, String lastName, Date dateEvent, String eMail, String username);

    public void delete(int id);

    public List<UserInfo> findByName(String firstName);

    public List<UserInfo> findByTwoName(String firstName, String lastName);

    public List<UserInfo> findByUsername(String username);

}
