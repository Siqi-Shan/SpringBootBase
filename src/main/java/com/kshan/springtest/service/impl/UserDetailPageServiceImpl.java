package com.kshan.springtest.service.impl;

import com.kshan.springtest.dao.UserDetailSpecDAO;
import com.kshan.springtest.dto.UserDetailDTO;
import com.kshan.springtest.service.UserDetailPageService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailPageServiceImpl implements UserDetailPageService {
    private final UserDetailSpecDAO userDetailSpecDAO;

    public UserDetailPageServiceImpl(UserDetailSpecDAO userDetailSpecDAO){
        this.userDetailSpecDAO = userDetailSpecDAO;
    }

    @Override
    public UserDetailDTO getUserDetailPage(UserDetailDTO userDetailDTO) {
        return userDetailSpecDAO.getUserDetailByUserId(userDetailDTO);
    }
}
