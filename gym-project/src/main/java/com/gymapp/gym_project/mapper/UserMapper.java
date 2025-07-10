package com.gymapp.gym_project.mapper;

import java.util.ArrayList;
import java.util.List;

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
        userDto.setId((long)user.getId());
        userDto.setName(user.getName());
        userDto.setSurName(user.getSurname());
        userDto.setEmail(user.getEmail());
        userDto.setNumber(user.getNumber());
        userDto.setGender(user.getGender());
        userDto.setAdress(user.getAdress());
        userDto.setBirthdayDate(user.getBirthdayDate());
        userDto.setPassword(user.getPassword());
        userDto.setRoleId(user.getRoleId());
        userDto.setFitnessCenterId(user.getFitnessCenterId());
        userDto.setCreatedAt(user.getCreatedAt());

        return userDto;
    }

    public User toEntity(UserDto userDto){
        if(userDto == null){
            return null;
        }
        User user = new User();
        if (userDto.getId() != null) {
            user.setId(userDto.getId().intValue());
        }
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurName());
        user.setEmail(userDto.getEmail());
        user.setNumber(userDto.getNumber());
        user.setGender(userDto.getGender());
        user.setAdress(userDto.getAdress());
        user.setBirthdayDate(userDto.getBirthdayDate());
        user.setPassword(userDto.getPassword());
        user.setRoleId(userDto.getRoleId());
        user.setFitnessCenterId(userDto.getFitnessCenterId());
        user.setCreatedAt(userDto.getCreatedAt());

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
