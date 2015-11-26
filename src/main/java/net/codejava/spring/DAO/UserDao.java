package net.codejava.spring.DAO;

import net.codejava.spring.model.User;

/**
 * Created by kwozniak on 26.11.15.
 */
public interface UserDao {

    User findUserByUserName(String userName);

}
