package com.gymapp.gym_project.controllers;

import com.gymapp.gym_project.dto.OfferDto;
import com.gymapp.gym_project.service.abstracts.OfferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offer")
public class OfferController {

    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }


    @GetMapping("/get-all")
    public ResponseEntity<List<OfferDto>> getAllOffers(){
        return ResponseEntity.ok(offerService.getAllOffers());
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<OfferDto> getOfferById(@PathVariable Long id){
        OfferDto dto = offerService.getOfferById(id);
        if (dto == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/create-offer")
    public ResponseEntity<OfferDto> createOffer(@RequestBody OfferDto offerDto){
        return ResponseEntity.ok(offerService.createOffer(offerDto));

    }

    @PutMapping("/update-offer/{id}")
    public ResponseEntity<OfferDto> updateOffer(@PathVariable Long id, @RequestBody OfferDto offerDto){
        OfferDto updated = offerService.updateOffer(id, offerDto);
        if (updated == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(updated);
    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteOffer(@PathVariable Long id) {
        offerService.deleteOffer(id);
        return ResponseEntity.noContent().build();
    }


}
