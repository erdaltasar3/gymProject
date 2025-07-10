package com.gymapp.gym_project.service.abstracts;

import com.gymapp.gym_project.dto.MembershipDto;
import java.util.List;

public interface MembershipService {
    List<MembershipDto> getAllMemberships();
    MembershipDto getMembershipById(Long id);
    MembershipDto createMembership(MembershipDto membershipDto);
    MembershipDto updateMembership(Long id, MembershipDto membershipDto);
    void deleteMembership(Long id);
}