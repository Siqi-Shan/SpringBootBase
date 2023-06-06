package com.kshan.springtest.service;

import com.kshan.springtest.dto.UserDTO;

import java.util.List;

public interface UserDetailListService {
    UserDTO selectUserWithDetails(Integer userId);
}
