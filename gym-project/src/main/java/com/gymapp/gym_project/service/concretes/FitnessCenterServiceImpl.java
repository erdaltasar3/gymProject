package com.gymapp.gym_project.service.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.gymapp.gym_project.dto.FitnessCenterDto;
import com.gymapp.gym_project.entity.FitnessCenter;
import com.gymapp.gym_project.mapper.FitnessCenterMapper;
import com.gymapp.gym_project.repository.IFitnessCenterRepository;
import com.gymapp.gym_project.service.abstracts.IFitnessCenterService;

@Service
public class FitnessCenterServiceImpl implements IFitnessCenterService {

    private final IFitnessCenterRepository fitnessCenterRepository;
    private final FitnessCenterMapper fitnessCenterMapper;

    public FitnessCenterServiceImpl(IFitnessCenterRepository fitnessCenterRepository, FitnessCenterMapper fitnessCenterMapper) {
        this.fitnessCenterRepository = fitnessCenterRepository;
        this.fitnessCenterMapper = fitnessCenterMapper;
    }
    

    @Override
    public FitnessCenterDto addFitnessCenter(FitnessCenterDto fitnessCenterDto) {
        FitnessCenter fitnessCenter = fitnessCenterMapper.toEntity(fitnessCenterDto);
        FitnessCenter savedFitnessCenter = fitnessCenterRepository.save(fitnessCenter);
        return fitnessCenterMapper.toDto(savedFitnessCenter);
    }


    @Override
    public FitnessCenterDto updateFitnessCenter(int id, FitnessCenterDto fitnessCenterDto) {
        
       Optional<FitnessCenter> optional =  fitnessCenterRepository.findById((long) id);

       if(optional.isPresent()){
            FitnessCenter fitnessCenter = optional.get();
            BeanUtils.copyProperties(fitnessCenterDto, fitnessCenter, "id");
            FitnessCenter updatedFitnessCenter = fitnessCenterRepository.save(fitnessCenter);
            return fitnessCenterMapper.toDto(updatedFitnessCenter);
       }

        return null;
        
    }


    @Override
    public void deleteFitnessCenter(Long id) {
        Optional<FitnessCenter> optional = fitnessCenterRepository.findById(id);
        if (optional.isPresent()) {
            fitnessCenterRepository.deleteById(id);
        } else {
            throw new RuntimeException("Fitness Center not found with id: " + id);
        }
    }


    @Override
    public FitnessCenterDto getFitnessCenterById(Long id) {
        Optional<FitnessCenter> optional = fitnessCenterRepository.findById(id);
        if (optional.isPresent()) {
            FitnessCenter fitnessCenter = optional.get();
            return fitnessCenterMapper.toDto(fitnessCenter);
        } else {
            throw new RuntimeException("Fitness Center not found with id: " + id);
        }
    }


    @Override
    public List<FitnessCenterDto> getAllFitnessCenters() {
        List<FitnessCenter> fitnessCenters = fitnessCenterRepository.findAll();
        return fitnessCenterMapper.toDtoList(fitnessCenters);
    }

 

}
