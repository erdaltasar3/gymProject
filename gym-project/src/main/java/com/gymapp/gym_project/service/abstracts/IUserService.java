package com.gymapp.gym_project.service.abstracts;

import java.util.List;

import com.gymapp.gym_project.dto.UserDto;

public interface IUserService {

    public List<UserDto> getAllUsers();
    public UserDto getUserById(Long id);
    public UserDto createUser(UserDto userDto);
    public UserDto updateUser(Long id, UserDto userDto);
    public void deleteUser(Long id);


}
