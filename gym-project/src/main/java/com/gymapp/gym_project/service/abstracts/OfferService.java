package com.gymapp.gym_project.service.abstracts;

import com.gymapp.gym_project.dto.OfferDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OfferService {

    List<OfferDto> getAllOffers();
    OfferDto getOfferById(Long id);
    OfferDto createOffer(OfferDto offerDto);
    OfferDto updateOffer(Long id, OfferDto offerDto);
    void deleteOffer(Long id);

}
