package com.kshan.springtest.service.impl;

import com.kshan.springtest.model.User;
import com.kshan.springtest.dao.UserDAO;
import com.kshan.springtest.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public User getUserById(Integer id) {
        return userDAO.selectByPrimaryKey(id);
    }

    @Override
    public void saveUser(User user) {
        userDAO.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateByPrimaryKey(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userDAO.deleteByPrimaryKey(id);
    }

    @Override
    public User getUserWithDetails(Integer id) {
        return UserDAO.selectUserWithDetails(id);
    }

}
