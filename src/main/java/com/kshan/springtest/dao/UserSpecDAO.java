package com.kshan.springtest.dao;

import com.kshan.springtest.dto.UserDTO;

import java.util.List;

public interface UserSpecDAO {
    List<UserDTO> selectUserWithDetails(Integer id);
}
