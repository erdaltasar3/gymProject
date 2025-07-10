package com.gymapp.gym_project.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.gymapp.gym_project.dto.UserDto;
import com.gymapp.gym_project.entity.User;


@Component
public class UserMapper {

    public UserDto toDto(User user){
        if(user == null){
            return null;
        }
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }

    public User toEntity(UserDto userDto){
        if(userDto == null){
            return null;
        }
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return user;
    }

    public List<UserDto> toDtoList(List<User> users) {
        if (users == null || users.isEmpty()) {
            return null;
        }
        List<UserDto> userDtos = new ArrayList<>();
        for (User user : users) {
            UserDto userDto = toDto(user);
            if (userDto != null) {
                userDtos.add(userDto);
            }
        }
        return userDtos;
    }

    public List<User> toEntityList(List<UserDto> userDtos) {
        if (userDtos == null || userDtos.isEmpty()) {
            return null;
        }
        List<User> users = new ArrayList<>();
        for (UserDto userDto : userDtos) {
            User user = toEntity(userDto);
            if (user != null) {
                users.add(user);
            }
        }
        return users;
    }




}
