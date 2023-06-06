package com.kshan.springtest.dto;

import com.kshan.springtest.model.UserDetail;
import lombok.Data;

import java.util.List;

@Data
public class UserDetailDTO {
    private Integer userId;

    private List<UserDetail> userDetails;

    private Integer pageNum;

    private Integer startNum;

    private Integer pageSize;
}
