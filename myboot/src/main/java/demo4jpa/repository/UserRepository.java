package demo4jpa.repository;

import demo4jpa.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by huangzheng on 2016/1/20.
 */
public interface UserRepository extends CrudRepository<User,Long>{
    List<User> findByUserName(String userName);
    List<User> findByPassWord(String passWord);
}
