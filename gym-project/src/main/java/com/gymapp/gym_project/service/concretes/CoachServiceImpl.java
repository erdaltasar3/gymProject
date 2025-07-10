package com.gymapp.gym_project.service.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.gymapp.gym_project.dto.CoachDto;
import com.gymapp.gym_project.entity.Coach;
import com.gymapp.gym_project.mapper.CoachMapper;
import com.gymapp.gym_project.repository.ICoachRepository;
import com.gymapp.gym_project.service.abstracts.ICoachService;

@Service
public class CoachServiceImpl implements ICoachService {

    private final CoachMapper coachMapper;
    private final ICoachRepository coachRepository;

    public CoachServiceImpl(CoachMapper coachMapper, ICoachRepository coachRepository) {
        this.coachMapper = coachMapper;
        this.coachRepository = coachRepository;
    }

    @Override
    public List<CoachDto> getAllCoaches() {
        List<Coach> coaches = coachRepository.findAll();
        return coachMapper.toDtoList(coaches);
    }


    @Override
    public CoachDto getCoachById(Long id) {
        Optional<Coach> coach =  coachRepository.findById((long) id);
        if(coach == null || coach.isEmpty()) {
            return null;
        }
        CoachDto coachDto = coachMapper.toDto(coach.get());
        if(coachDto != null && coachDto.getId() != null) {
            return coachDto;
        }
        return null;
    }

    @Override
    public CoachDto createCoach(CoachDto coachDto) {
        Coach coach = coachMapper.toEntity(coachDto);
        Coach savedCoach = coachRepository.save(coach);
        return coachMapper.toDto(savedCoach);
    }

    @Override
    public CoachDto updateCoach(Long id, CoachDto coachDto) {

        Optional<Coach> optional = coachRepository.findById(id);
        if(optional == null || optional.isEmpty()) {
            return null;
        }
        Coach coach = optional.get();
        BeanUtils.copyProperties(coachDto, coach, "id");
        Coach updatedCoach = coachRepository.save(coach);
        return coachMapper.toDto(updatedCoach);
        

    }

    @Override
    public void deleteCoach(Long id) {
        
        Optional<Coach> coach = coachRepository.findById(id);

        if(coach == null || coach.isEmpty()) {
            throw new RuntimeException("Coach not found with id: " + id);
        } else {
            coachRepository.deleteById(id);
        }
    }



}
