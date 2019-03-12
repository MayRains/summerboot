package frameworkdemo.summerboot.service;

import frameworkdemo.summerboot.dao.userDao;
import frameworkdemo.summerboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    private userDao userdao;

    public User findUserByid(int id) {
        return userdao.findByUserid(id);
    }

    public ArrayList<User> findUsers() {
        return userdao.findUers();
    }
}
