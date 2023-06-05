package com.kshan.springtest.service.impl;

import com.kshan.springtest.model.UserDetail;
import com.kshan.springtest.dao.UserDetailMapper;
import com.kshan.springtest.service.UserDetailService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailService {
    private final UserDetailMapper userDetailMapper;

    public UserDetailServiceImpl(UserDetailMapper userDetailMapper){
        this.userDetailMapper = userDetailMapper;
    }

    @Override
    public UserDetail getUserDetail(int id) {
        return userDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveUserDetail(UserDetail userDetail) {
        userDetailMapper.insert(userDetail);
    }

    @Override
    public void updateUserDetail(UserDetail userDetail) {
        userDetailMapper.updateByPrimaryKeySelective(userDetail);
    }

    @Override
    public void deleteUserDetail(int id) {
        userDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public UserDetail getUserDetailByUserId(int userId) {
        return userDetailMapper.selectByUserId(userId);
    }
}
