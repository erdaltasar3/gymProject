package com.gymapp.gym_project.mapper;

import com.gymapp.gym_project.dto.OfferDto;
import com.gymapp.gym_project.entity.Offer;
import org.springframework.stereotype.Component;

@Component
public class OfferMapper {


    public OfferDto toDto(Offer offer){
        if(offer == null) return null;
        OfferDto dto = new OfferDto();
        dto.setId(offer.getId());
        dto.setName(offer.getName());
        dto.setExplanation(offer.getExplanation());
        dto.setStartDate(offer.getStartDate());
        dto.setFinishDate(offer.getFinishDate());
        dto.setPrice(offer.getPrice());
        return dto;

    }

    public Offer toEntity(OfferDto dto){
        if(dto == null) return null;
        Offer offer = new Offer();
        offer.setId(dto.getId());
        offer.setName(dto.getName());
        offer.setExplanation(dto.getExplanation());
        offer.setStartDate(dto.getStartDate());
        offer.setFinishDate(dto.getFinishDate());
        offer.setPrice(dto.getPrice());
        return offer;
    }

}
