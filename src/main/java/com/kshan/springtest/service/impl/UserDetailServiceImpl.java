package com.kshan.springtest.service.impl;

import com.kshan.springtest.model.UserDetail;
import com.kshan.springtest.dao.UserDetailDAO;
import com.kshan.springtest.service.UserDetailService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailService {
    private final UserDetailDAO userDetailDAO;

    public UserDetailServiceImpl(UserDetailDAO userDetailDAO){
        this.userDetailDAO = userDetailDAO;
    }

    @Override
    public UserDetail getUserDetail(int id) {
        return userDetailDAO.selectByPrimaryKey(id);
    }

    @Override
    public void saveUserDetail(UserDetail userDetail) {
        userDetailDAO.insert(userDetail);
    }

    @Override
    public void updateUserDetail(UserDetail userDetail) {
        userDetailDAO.updateByPrimaryKeySelective(userDetail);
    }

    @Override
    public void deleteUserDetail(int id) {
        userDetailDAO.deleteByPrimaryKey(id);
    }
}
