package com.gymapp.gym_project.service.abstracts;

import java.util.List;

import com.gymapp.gym_project.dto.CoachDto;

public interface ICoachService {

    public List<CoachDto> getAllCoaches();
    // public CoachDto getCoachByUserId(int userId);
    public CoachDto getCoachById(Long id);
    public CoachDto createCoach(CoachDto coachDto);
    public CoachDto updateCoach(Long id, CoachDto coachDto);
    public void deleteCoach(Long id);

}
