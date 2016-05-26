package lviv.first.Service.impl;

import lviv.first.Dao.UsersInfoDao;
import lviv.first.Service.UserInfoService;
import lviv.first.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class UserInfoServiceimpl implements UserInfoService {

    @Autowired
    private UsersInfoDao usersInfoDao;

    public void add(String firstName, String lastName, Date dateBirth, String eMail, String username) {
        UserInfo userInfo = new UserInfo(dateBirth, lastName, firstName, eMail, username);
        usersInfoDao.add(userInfo);

    }

    public void edit(int id, String firstName, String lastName, Date dateEvent, String eMail, String username) {
        UserInfo userInfo = usersInfoDao.findById(id);
        if (firstName != null) {
            userInfo.setFirstName(firstName);
        }
        if (lastName != null) {
            userInfo.setLastName(lastName);
        }
        if (dateEvent != null) {
            userInfo.setDateBirth(dateEvent);
        }
        if (eMail != null) {
            userInfo.seteMail(eMail);
        }
        if (username != null) {
            userInfo.setUsername(username);
        }
        usersInfoDao.edit(userInfo);


    }


    public void delete(int id) {
        UserInfo userInfo = usersInfoDao.findById(id);

        usersInfoDao.delete(userInfo);

    }

    public List<UserInfo> findByName(String firstName) {
        return usersInfoDao.findByName(firstName);
    }

    public List<UserInfo> findByTwoName(String firstName, String lastName) {
        return usersInfoDao.findByTwoName(firstName, lastName);
    }

    public List<UserInfo> findByUsername(String username) {
        return (List<UserInfo>) usersInfoDao.findByUsername(username);
    }
}
