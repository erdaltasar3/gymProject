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

import com.gymapp.gym_project.dto.CoachDto;
import com.gymapp.gym_project.service.abstracts.ICoachService;

@RestController
@RequestMapping("/coach")
public class CoachController {

    private final ICoachService coachService;

    public CoachController(ICoachService coachService) {
        this.coachService = coachService;
    }


    @GetMapping("/list")
    public ResponseEntity<List<CoachDto>> getAllCoaches() {
        return ResponseEntity.ok(coachService.getAllCoaches());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CoachDto> getCoachById(@PathVariable Long id) {
        CoachDto coachDto = coachService.getCoachById(id);
        if (coachDto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(coachDto);
    }

    @PostMapping("/add")
    public ResponseEntity<CoachDto> createCoach(@RequestBody CoachDto coachDto){
        return ResponseEntity.ok(coachService.createCoach(coachDto));
    }

    @PutMapping("/update/{id}")
    public CoachDto updateCoach(@PathVariable Long id, @RequestBody CoachDto coachDto){
        return coachService.updateCoach(id, coachDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCoach(@PathVariable Long id){
        coachService.deleteCoach(id);
    }

}
