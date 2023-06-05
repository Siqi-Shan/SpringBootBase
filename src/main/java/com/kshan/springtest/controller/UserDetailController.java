package com.kshan.springtest.controller;

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
    public ResponseEntity<UserDetail> getUserDetail(@PathVariable("id") int id) {
        return ResponseEntity.ok(userDetailService.getUserDetail(id));
    }

    @PostMapping
    public ResponseEntity<UserDetail> saveUserDetail(@RequestBody UserDetail userDetail) {
        userDetailService.saveUserDetail(userDetail);
        return ResponseEntity.ok(userDetail);
    }

    @PutMapping
    public ResponseEntity<UserDetail> updateUserDetail(@RequestBody UserDetail userDetail) {
        userDetailService.updateUserDetail(userDetail);
        return ResponseEntity.ok(userDetail);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserDetail(@PathVariable("id") int id) {
        userDetailService.deleteUserDetail(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserDetail> getUserDetailByUserId(@PathVariable int userId) {
        UserDetail userDetail = userDetailService.getUserDetailByUserId(userId);
        return ResponseEntity.ok(userDetail);
    }
}
