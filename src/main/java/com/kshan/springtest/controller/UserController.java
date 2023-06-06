package com.kshan.springtest.controller;

import com.kshan.springtest.common.util.ResultModel;
import com.kshan.springtest.dto.UserDTO;
import com.kshan.springtest.model.User;
import com.kshan.springtest.service.UserDetailListService;
import com.kshan.springtest.service.UserDetailService;
import com.kshan.springtest.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final UserDetailListService userDetailListService;

    public UserController(UserService userService, UserDetailListService userDetailListService){
        this.userService = userService;
        this.userDetailListService = userDetailListService;
    }

    @GetMapping("/{id}")
    public ResultModel getUser(@PathVariable("id") Integer id) {
        User user = userService.getUserById(id);
        if (user != null) {
            return ResultModel.success("User fetched successfully.", user);
        } else {
            return ResultModel.error("User not found.");
        }
    }

    @PostMapping
    public ResultModel addUser(@RequestBody User user) {
        userService.saveUser(user);
        return ResultModel.success("User created successfully.", user);
    }

    @PutMapping("/{id}")
    public ResultModel updateUser(@PathVariable("id") Integer id, @RequestBody User user) {
        User currentUser = userService.getUserById(id);
        if (currentUser != null) {
            user.setId(id); // Make sure the updated user has the same ID
            userService.updateUser(user);
            return ResultModel.success("User updated successfully.", user);
        } else {
            return ResultModel.error("User not found.");
        }
    }

    @DeleteMapping("/{id}")
    public ResultModel deleteUser(@PathVariable("id") Integer id) {
        User currentUser = userService.getUserById(id);
        if (currentUser != null) {
            userService.deleteUser(id);
            return ResultModel.success("User deleted successfully.", currentUser);
        } else {
            return ResultModel.error("User not found.");
        }
    }

    @GetMapping("/{id}/details")
    public ResultModel getUserWithDetails(@PathVariable("id") Integer id) {
        UserDTO user = userDetailListService.selectUserWithDetails(id);
        if (user != null) {
            return ResultModel.success("User details fetched successfully.", user);
        } else {
            return ResultModel.error("User not found.");
        }
    }
}
