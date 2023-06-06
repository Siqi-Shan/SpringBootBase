package com.kshan.springtest.dto;

import com.kshan.springtest.model.UserDetail;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private Integer id;

    private String name;

    private String email;

    private List<UserDetail> userDetails;
}
