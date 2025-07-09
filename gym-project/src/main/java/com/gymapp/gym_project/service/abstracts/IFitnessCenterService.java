package com.gymapp.gym_project.service.abstracts;

import java.util.List;

import com.gymapp.gym_project.dto.FitnessCenterDto;

public interface IFitnessCenterService {
    
    FitnessCenterDto addFitnessCenter(FitnessCenterDto fitnessCenterDto);
    FitnessCenterDto updateFitnessCenter(int id ,FitnessCenterDto fitnessCenterDto);
    void deleteFitnessCenter(Long id);
    FitnessCenterDto getFitnessCenterById(Long id);
    List<FitnessCenterDto> getAllFitnessCenters();

       

}
