package com.kshan.springtest.service.impl;

import com.kshan.springtest.dao.UserSpecDAO;
import com.kshan.springtest.dto.UserDTO;
import com.kshan.springtest.service.UserDetailListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailListServiceImpl implements UserDetailListService {
    private final UserSpecDAO userSpecDAO;

    public UserDetailListServiceImpl(UserSpecDAO userSpecDAO){
        this.userSpecDAO = userSpecDAO;
    }

    @Override
    public UserDTO selectUserWithDetails(Integer userId) {
        return userSpecDAO.selectUserWithDetails(userId);
    }
}
