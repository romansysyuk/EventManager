package lviv.first.Controller;

import lviv.first.Service.UserInfoService;
import lviv.first.Service.UsersService;
import lviv.first.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    Users users;


    @RequestMapping(value = "/createUserInfo", method = RequestMethod.POST)
    public String addUserInfo(@RequestParam(value = "firstName") String firstName, @RequestParam(value = "lastName") String lastName,
                              @RequestParam(value = "dateBirth") Date dateBirth, @RequestParam(value = "eMail") String eMail, @RequestParam(value = "username") String username) {


        userInfoService.add(firstName, lastName, dateBirth, eMail, users.getUsername());
        return "/userPage";

    }


}
