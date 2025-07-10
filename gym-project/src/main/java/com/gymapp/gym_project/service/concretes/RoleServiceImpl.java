package com.gymapp.gym_project.service.concretes;


import com.gymapp.gym_project.entity.Role;
import com.gymapp.gym_project.repository.IRoleRepository;
import com.gymapp.gym_project.dto.RoleDto;
import com.gymapp.gym_project.mapper.RoleMapper;
import com.gymapp.gym_project.service.abstracts.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final IRoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl(IRoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDto> getAllRoles() {
        return roleRepository.findAll()
                .stream()
                .map(roleMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public RoleDto getRoleById(Long id) {
        Optional<Role> role = roleRepository.findById(id);
        return role.map(roleMapper::toDto).orElse(null);
    }

    @Override
    public RoleDto createRole(RoleDto roleDto) {
        Role role = roleMapper.toEntity(roleDto);
        Role saved = roleRepository.save(role);
        return roleMapper.toDto(saved);
    }

    @Override
    public RoleDto updateRole(Long id, RoleDto roleDto) {
        Optional<Role> optionalRole = roleRepository.findById(id);
        if (optionalRole.isPresent()) {
            Role role = optionalRole.get();
            role.setName(roleDto.getName());
            Role updated = roleRepository.save(role);
            return roleMapper.toDto(updated);
        } else {
            return null;
        }
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}