package com.gymapp.gym_project.controllers;


import com.gymapp.gym_project.dto.RoleDto;
import com.gymapp.gym_project.service.abstracts.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/get-all-role")
    public ResponseEntity<List<RoleDto>> getAllRoles() {
        return ResponseEntity.ok(roleService.getAllRoles());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleDto> getRoleById(@PathVariable Long id) {
        RoleDto dto = roleService.getRoleById(id);
        if (dto == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/add-role")
    public ResponseEntity<RoleDto> createRole(@RequestBody RoleDto roleDto) {
        if (roleDto == null || roleDto.getName() == null || roleDto.getName().isEmpty()) {
            throw new IllegalArgumentException("Role name cannot be null or empty");
        }
        return ResponseEntity.ok(roleService.createRole(roleDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RoleDto> updateRole(@PathVariable Long id, @RequestBody RoleDto roleDto) {
        RoleDto updated = roleService.updateRole(id, roleDto);
        if (updated == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteRole(@PathVariable Long id) {
        roleService.deleteRole(id);
        return ResponseEntity.noContent().build();
    }
}