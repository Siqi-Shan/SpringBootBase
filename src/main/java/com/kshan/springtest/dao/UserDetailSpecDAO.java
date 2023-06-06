package com.kshan.springtest.dao;

import com.kshan.springtest.dto.UserDetailDTO;

public interface UserDetailSpecDAO {
    UserDetailDTO getUserDetailByUserId(UserDetailDTO userDetailDTO);
}
