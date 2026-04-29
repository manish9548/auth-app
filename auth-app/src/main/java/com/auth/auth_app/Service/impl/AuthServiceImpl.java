package com.auth.auth_app.Service.impl;

import com.auth.auth_app.Dto.UserDto;
import com.auth.auth_app.Service.AuthService;
import com.auth.auth_app.Service.UserService;

public class AuthServiceImpl implements AuthService {
    private UserService userService;

    @Override
    public UserDto registerUser(UserDto userDto) {
        //logic
        //verify email
        //varify password
        //default role
        UserDto userDto1 = userService.createUser(userDto);

        return userDto1;
    }
}
