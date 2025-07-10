package com.gymapp.gym_project.mapper;

import com.gymapp.gym_project.entity.Membership;
import com.gymapp.gym_project.dto.MembershipDto;
import org.springframework.stereotype.Component;

@Component
public class MembershipMapper {

    public MembershipDto toDto(Membership membership) {
        if (membership == null) return null;
        MembershipDto dto = new MembershipDto();
        dto.setId(membership.getId());
        dto.setUserId(membership.getUserId());
        dto.setStartDate(membership.getStartDate());
        dto.setFinishDate(membership.getFinishDate());
        dto.setPaymentId(membership.getPaymentId());
        dto.setOfferId(membership.getOfferId());
        dto.setActiveMember(membership.isActiveMember());
        dto.setRemainingDay(membership.getRemainingDay());
        dto.setCreatedAt(membership.getCreatedAt());
        return dto;
    }

    public Membership toEntity(MembershipDto dto) {
        if (dto == null) return null;
        Membership membership = new Membership();
        membership.setId(dto.getId());
        membership.setUserId(dto.getUserId());
        membership.setStartDate(dto.getStartDate());
        membership.setFinishDate(dto.getFinishDate());
        membership.setPaymentId(dto.getPaymentId());
        membership.setOfferId(dto.getOfferId());
        membership.setActiveMember(dto.isActiveMember());
        membership.setRemainingDay(dto.getRemainingDay());
        membership.setCreatedAt(dto.getCreatedAt());
        return membership;
    }
}