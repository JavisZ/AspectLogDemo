package com.zcurd.controller;

import com.zcurd.model.Result;
import com.zcurd.model.User;
import com.zcurd.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.NotFoundException;

@RestController
public class UserController {

    @Autowired
    UserService mUserService;

    @PostMapping("/add")
    public Result add(User user) throws NotFoundException {
        return mUserService.add(user);
    }
}
