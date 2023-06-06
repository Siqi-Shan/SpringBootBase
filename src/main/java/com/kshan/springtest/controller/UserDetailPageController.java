package com.kshan.springtest.controller;

import com.kshan.springtest.dto.UserDetailDTO;
import com.kshan.springtest.service.UserDetailPageService;
import com.kshan.springtest.common.util.ResultModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userDetailPage")
public class UserDetailPageController {
    private final UserDetailPageService userDetailPageService;

    public UserDetailPageController(UserDetailPageService userDetailPageService){
        this.userDetailPageService = userDetailPageService;
    }

    @PostMapping
    public ResultModel getUserDetailPage(@RequestBody UserDetailDTO userDetailDTO) {
        userDetailDTO.setStartNum(userDetailDTO.getPageNum() * userDetailDTO.getPageSize());
        return ResultModel.success(userDetailPageService.getUserDetailPage(userDetailDTO));
    }
}
