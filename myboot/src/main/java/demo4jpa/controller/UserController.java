package demo4jpa.controller;

import demo4jpa.entity.User;
import demo4jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by huangzheng on 2016/1/20.
 */

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @RequestMapping("/list")
    public List<User> list() {
        List<User> users = new ArrayList<>();
        for(User user:userRepository.findAll()){
            users.add(user);
        }

    return users;
    }
    @RequestMapping("/findOne")
    public User findOne(String userName){
        User user = userRepository.findByUserName(userName).get(0);
        /*for(User user1:userRepository.findByUserName(userName)){
            System.out.println(user1.getUserName());
            System.out.println(user1.getId());
            System.out.println(user1.getPassWord());
        }*/
        return user;
    }

    @RequestMapping(value = "/insertUser")
    public String insertUser(@RequestBody User user){
        userRepository.save(user);
        return "success";
    }

    @RequestMapping("/updateUser")
    public String updateUser(Long id,String userName,String passWord){
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setPassWord(passWord);
        if(userRepository.exists(id)){
            userRepository.delete(id);
        }
        userRepository.save(user);
        return null;

    }

}
