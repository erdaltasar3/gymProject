package com.gymapp.gym_project.mapper;
import com.gymapp.gym_project.Entity.Role;
import com.gymapp.gym_project.dto.RoleDto;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {
    public RoleDto toDto(Role role) {
        if (role == null) return null;
        RoleDto dto = new RoleDto();
        dto.setId(role.getId());
        dto.setName(role.getName());
        return dto;
    }

    public Role toEntity(RoleDto dto) {
        if (dto == null) return null;
        Role role = new Role();
        role.setId(dto.getId());
        role.setName(dto.getName());
        return role;
    }
}
