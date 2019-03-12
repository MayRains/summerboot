package frameworkdemo.summerboot.controller;

import frameworkdemo.summerboot.pojo.User;
import frameworkdemo.summerboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class usercontroller {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "user/{id}")
    public User findById(@PathVariable int id) {
        return userService.findUserByid(id);
    }

    @RequestMapping(value = "getusers", method = RequestMethod.GET)
    public ArrayList<User> findUsers() {
        return userService.findUsers();
    }

}
