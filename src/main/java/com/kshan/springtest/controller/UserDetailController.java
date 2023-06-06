package com.kshan.springtest.controller;

import com.kshan.springtest.common.util.ResultModel;
import com.kshan.springtest.model.UserDetail;
import com.kshan.springtest.service.UserDetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userDetails")
public class UserDetailController {
    private final UserDetailService userDetailService;

    public UserDetailController(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    @GetMapping("/{id}")
    public ResultModel<UserDetail> getUserDetail(@PathVariable("id") int id) {
        UserDetail userDetail = userDetailService.getUserDetail(id);
        if (userDetail != null) {
            return ResultModel.success("User detail fetched successfully.", userDetail);
        } else {
            return ResultModel.error("User detail not found.");
        }
    }

    @PostMapping
    public ResultModel<UserDetail> saveUserDetail(@RequestBody UserDetail userDetail) {
        userDetailService.saveUserDetail(userDetail);
        return ResultModel.success("User detail saved successfully.", userDetail);
    }

    @PutMapping
    public ResultModel<UserDetail> updateUserDetail(@RequestBody UserDetail userDetail) {
        userDetailService.updateUserDetail(userDetail);
        return ResultModel.success("User detail updated successfully.", userDetail);
    }

    @DeleteMapping("/{id}")
    public ResultModel deleteUserDetail(@PathVariable("id") int id) {
        UserDetail currentUserDetail = userDetailService.getUserDetail(id);
        if (currentUserDetail != null) {
            userDetailService.deleteUserDetail(id);
            return ResultModel.success("User detail deleted successfully.", currentUserDetail);
        } else {
            return ResultModel.error("User detail not found.");
        }
    }


//    @GetMapping("/user/{userId}")
//    public ResponseEntity<UserDetail> getUserDetailByUserId(@PathVariable int userId) {
//        UserDetail userDetail = userDetailService.getUserDetailByUserId(userId);
//        return ResponseEntity.ok(userDetail);
//    }
}
