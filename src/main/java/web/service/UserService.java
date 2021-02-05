package web.service;

import web.entity.Role;
import web.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(long id);
    void save(User user);
    void delete(User user);
    User findUserByUsername(String username);
    Role getRoleByName(String name);
}
