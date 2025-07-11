package com.gymapp.gym_project.service.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.gymapp.gym_project.dto.UserDto;
import com.gymapp.gym_project.entity.User;
import com.gymapp.gym_project.mapper.UserMapper;
import com.gymapp.gym_project.repository.IUserRepository;
import com.gymapp.gym_project.service.abstracts.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(IUserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<UserDto> userDtos = userMapper.toDtoList(userRepository.findAll());
        if (userDtos == null || userDtos.isEmpty()) {
            throw new RuntimeException("No users found");
        }
        return userDtos;
    }

    @Override
    public UserDto getUserById(Long id) {
        
        Optional<User> optional = userRepository.findById(id.intValue());
        if (optional.isEmpty()) {
            return null;
        }

        UserDto userDto = userMapper.toDto(optional.get());
        if (userDto != null) {
            return userDto;
        }
        return null;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        if(userDto == null){
            return null;
        }
        User user = userMapper.toEntity(userDto);
        User savedUser = userRepository.save(user);
        return userMapper.toDto(savedUser);
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        
        if (userDto == null || id == null) {
            return null;
        }

        Optional<User> optional = userRepository.findById(id.intValue());
        if (optional.isEmpty()) {
            return null;
        }
        User userDb = optional.get();
        BeanUtils.copyProperties(userDto, userDb, "id", "createdAt");
        userDb.setSurname(userDto.getSurName());
        User updatedUser = userRepository.save(userDb);
        return userMapper.toDto(updatedUser);
    }

    @Override
    public void deleteUser(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("User ID cannot be null");
        }
        Optional<User> optional = userRepository.findById(id.intValue());
        if(optional.isPresent()){
            userRepository.delete(optional.get());
        }
    }


}
