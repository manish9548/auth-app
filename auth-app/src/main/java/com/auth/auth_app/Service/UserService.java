package com.auth.auth_app.Service;

import com.auth.auth_app.Dto.UserDto;
import com.auth.auth_app.entities.User;

public interface UserService {

    UserDto createUser(UserDto userDto );
    UserDto getUserByEmail(String email);
    UserDto updateUser(UserDto userDto, String userId);
    void deleteUser(String userId);

    UserDto  getUserById(String userId);

    Iterable<UserDto> getAllUsers();
}
