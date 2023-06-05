package com.kshan.springtest.service;

import com.kshan.springtest.model.UserDetail;

public interface UserDetailService {
    UserDetail getUserDetail(int id);
    void saveUserDetail(UserDetail userDetail);
    void updateUserDetail(UserDetail userDetail);
    void deleteUserDetail(int id);
    UserDetail getUserDetailByUserId(int userId);
}
