package com.gymapp.gym_project.controllers;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gymapp.gym_project.dto.FitnessCenterDto;
import com.gymapp.gym_project.service.abstracts.IFitnessCenterService;

@RestController
@RequestMapping("/fitness-centers")
public class FitnessCenterController {

    private final IFitnessCenterService fitnessCenterService;

    public FitnessCenterController(IFitnessCenterService fitnessCenterService) {
        this.fitnessCenterService = fitnessCenterService;
    }

    @PostMapping("/add")
    public ResponseEntity<FitnessCenterDto> addFitnessCenter(@RequestBody FitnessCenterDto fitnessCenterDto) {
            if (fitnessCenterDto == null || fitnessCenterDto.getName() == null || fitnessCenterDto.getName().isEmpty()) {
                throw new IllegalArgumentException("Fitness Center name cannot be null or empty");
            }
        return ResponseEntity.ok(fitnessCenterService.addFitnessCenter(fitnessCenterDto));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<FitnessCenterDto> updateFitnessCenter(@PathVariable int id, @RequestBody FitnessCenterDto fitnessCenterDto) {
        if (fitnessCenterDto == null || fitnessCenterDto.getName() == null || fitnessCenterDto.getName().isEmpty()) {
            throw new IllegalArgumentException("Fitness Center name cannot be null or empty");
        }
        return ResponseEntity.ok(fitnessCenterService.updateFitnessCenter(id, fitnessCenterDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFitnessCenter(@PathVariable Long id) {
        fitnessCenterService.deleteFitnessCenter(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FitnessCenterDto> getFitnessCenterById(@PathVariable Long id) {
        FitnessCenterDto fitnessCenterDto = fitnessCenterService.getFitnessCenterById(id);
        if (fitnessCenterDto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(fitnessCenterDto);
    }

    @GetMapping("/list")
    public ResponseEntity<List<FitnessCenterDto>> getAllFitnessCenters() {
        List<FitnessCenterDto> fitnessCenters = fitnessCenterService.getAllFitnessCenters();
        return ResponseEntity.ok(fitnessCenters);
    }


}
