package com.gymapp.gym_project.controllers;

import com.gymapp.gym_project.dto.MembershipDto;
import com.gymapp.gym_project.service.abstracts.MembershipService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memberships")
public class MembershipController {

    private final MembershipService membershipService;

    public MembershipController(MembershipService membershipService) {
        this.membershipService = membershipService;
    }

    @GetMapping("/get-all-memberships")
    public ResponseEntity<List<MembershipDto>> getAllMemberships() {
        return ResponseEntity.ok(membershipService.getAllMemberships());
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<MembershipDto> getMembershipById(@PathVariable Long id) {
        MembershipDto dto = membershipService.getMembershipById(id);
        if (dto == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/create-membership")
    public ResponseEntity<MembershipDto> createMembership(@RequestBody MembershipDto membershipDto) {
        return ResponseEntity.ok(membershipService.createMembership(membershipDto));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<MembershipDto> updateMembership(@PathVariable Long id, @RequestBody MembershipDto membershipDto) {
        MembershipDto updated = membershipService.updateMembership(id, membershipDto);
        if (updated == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMembership(@PathVariable Long id) {
        membershipService.deleteMembership(id);
        return ResponseEntity.noContent().build();
    }
}