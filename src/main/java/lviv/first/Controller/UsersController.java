package lviv.first.Controller;

import lviv.first.Dao.UsersDao;
import lviv.first.Service.UsersService;
import lviv.first.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
    public String addUser(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        usersService.add(username, password);
        return "/createUserInfo";
    }


}
