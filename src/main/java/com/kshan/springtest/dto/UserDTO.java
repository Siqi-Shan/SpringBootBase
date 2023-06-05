package com.kshan.springtest.dto;

import com.kshan.springtest.model.UserDetail;
import lombok.Data;

@Data
public class UserDTO {
    private Integer id;

    private String name;

    private String email;

    private UserDetail userDetail;
}
