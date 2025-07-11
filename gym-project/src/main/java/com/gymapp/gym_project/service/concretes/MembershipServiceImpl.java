package com.gymapp.gym_project.service.concretes;

import com.gymapp.gym_project.dto.MembershipDto;
import com.gymapp.gym_project.entity.Membership;
import com.gymapp.gym_project.mapper.MembershipMapper;
import com.gymapp.gym_project.repository.IMembershipRepository;
import com.gymapp.gym_project.service.abstracts.MembershipService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MembershipServiceImpl implements MembershipService {

    private final IMembershipRepository membershipRepository;
    private final MembershipMapper membershipMapper;

    public MembershipServiceImpl(IMembershipRepository membershipRepository, MembershipMapper membershipMapper) {
        this.membershipRepository = membershipRepository;
        this.membershipMapper = membershipMapper;
    }

    @Override
    public List<MembershipDto> getAllMemberships() {
        return membershipRepository.findAll()
                .stream()
                .map(membershipMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public MembershipDto getMembershipById(Long id) {
        Optional<Membership> membership = membershipRepository.findById(id);
        return membership.map(membershipMapper::toDto).orElse(null);
    }

    @Override
    public MembershipDto createMembership(MembershipDto membershipDto) {
        Membership membership = membershipMapper.toEntity(membershipDto);
        membership.setId(null);
        Membership saved = membershipRepository.save(membership);
        return membershipMapper.toDto(saved);
    }

    @Override
    public MembershipDto updateMembership(Long id, MembershipDto membershipDto) {
        Optional<Membership> optionalMembership = membershipRepository.findById(id);
        if (optionalMembership.isPresent()) {
            Membership membership = optionalMembership.get();
            membership.setUserId(membershipDto.getUserId());
            membership.setStartDate(membershipDto.getStartDate());
            membership.setFinishDate(membershipDto.getFinishDate());
            membership.setPaymentId(membershipDto.getPaymentId());
            membership.setOfferId(membershipDto.getOfferId());
            membership.setActiveMember(membershipDto.isActiveMember());
            membership.setRemainingDay(membershipDto.getRemainingDay());
            // createdAt genellikle dokunulmaz
            Membership updated = membershipRepository.save(membership);
            return membershipMapper.toDto(updated);
        } else {
            return null;
        }
    }

    @Override
    public void deleteMembership(Long id) {
        membershipRepository.deleteById(id);
    }
}