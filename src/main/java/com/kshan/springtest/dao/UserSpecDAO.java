package com.kshan.springtest.dao;

import com.kshan.springtest.dto.UserDTO;

public interface UserSpecDAO {
    UserDTO selectUserWithDetails(Integer id);
}
