package com.kshan.springtest.service;

import com.kshan.springtest.domain.User;

public interface UserService {
    User getUserById(Integer id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Integer id);
}
