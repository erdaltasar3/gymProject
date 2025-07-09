package com.gymapp.gym_project.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.gymapp.gym_project.dto.CoachDto;
import com.gymapp.gym_project.entity.Coach;

public class CoachMapper {
    

    public CoachDto toDto(Coach coach){
        if (coach == null || coach.getId() == null) {
            return null;
        }
        CoachDto coachDto = new CoachDto();
        BeanUtils.copyProperties(coach, coachDto);
        return coachDto;
    }

    public Coach toEntity(CoachDto coachDto) {
        if (coachDto == null || coachDto.getId() == null) {
            return null;
        }
        Coach coach = new Coach();
        BeanUtils.copyProperties(coachDto, coach);
        return coach;
    }

    public List<CoachDto> toDtoList(List<Coach> coaches) {

        List<CoachDto> coachDtoList = new ArrayList<>();

        if (coaches == null || coaches.isEmpty()) {
            return null;
        }

        for(Coach coach : coaches){
            CoachDto coachDto = toDto(coach);
            if(coachDto != null){
                coachDtoList.add(coachDto);
            }
        }
        return coachDtoList; 
    }

    public List<Coach> toEntityList(List<CoachDto> coachDtos) {

        List<Coach> coachList = new ArrayList<>();

        if (coachDtos == null || coachDtos.isEmpty()) {
            return null;
        }

        for(CoachDto coachDto : coachDtos){
            Coach coach = toEntity(coachDto);
            if(coach != null){
                coachList.add(coach);
            }
        }
        return coachList; 
    }






















}
