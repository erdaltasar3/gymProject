package com.gymapp.gym_project.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.gymapp.gym_project.dto.FitnessCenterDto;
import com.gymapp.gym_project.entity.FitnessCenter;

@Component
public class FitnessCenterMapper {

    public FitnessCenterDto toDto(FitnessCenter fitnessCenter) {
        if (fitnessCenter == null) return null;
        FitnessCenterDto dto = new FitnessCenterDto();
        BeanUtils.copyProperties(fitnessCenter, dto);
        return dto;
    }

    public FitnessCenter toEntity(FitnessCenterDto dto) {
        if (dto == null) return null;
        FitnessCenter fitnessCenter = new FitnessCenter();
        BeanUtils.copyProperties(dto, fitnessCenter);
        return fitnessCenter;
    }

    public List<FitnessCenterDto> toDtoList(List<FitnessCenter> fitnessCenters) {
        if (fitnessCenters == null || fitnessCenters.isEmpty()){
            return null;
        }
        List<FitnessCenterDto> dtoList = new ArrayList<>();;

        for(FitnessCenter fitnessCenter : fitnessCenters){
            FitnessCenterDto dto = toDto(fitnessCenter);
            if (dto != null) {
                dtoList.add(dto);
            }
        }
        return dtoList;
    }

    public List<FitnessCenter> toEntityList(List<FitnessCenterDto> dtoList) {
        if (dtoList == null || dtoList.isEmpty()) {
            return null;
        }
        List<FitnessCenter> fitnessCenters = new ArrayList<>();
        
        for (FitnessCenterDto dto : dtoList) {
            FitnessCenter fitnessCenter = toEntity(dto);
            if (fitnessCenter != null) {
                fitnessCenters.add(fitnessCenter);
            }
        }
        return fitnessCenters;
    }


}
