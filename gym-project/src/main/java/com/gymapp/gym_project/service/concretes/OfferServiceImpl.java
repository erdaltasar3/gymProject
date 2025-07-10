package com.gymapp.gym_project.service.concretes;

import com.gymapp.gym_project.dto.OfferDto;
import com.gymapp.gym_project.entity.Offer;
import com.gymapp.gym_project.mapper.OfferMapper;
import com.gymapp.gym_project.repository.IOfferRepository;
import com.gymapp.gym_project.service.abstracts.OfferService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OfferServiceImpl implements OfferService {

    private final IOfferRepository offerRepository;
    private final OfferMapper offerMapper;

    public OfferServiceImpl(IOfferRepository offerRepository, OfferMapper offerMapper) {
        this.offerRepository = offerRepository;
        this.offerMapper = offerMapper;
    }


    @Override
    public List<OfferDto> getAllOffers() {
        return offerRepository.findAll().stream().map(offerMapper::toDto).toList();
    }

    @Override
    public OfferDto getOfferById(Long id) {
        Optional<Offer> offer=offerRepository.findById(id);
        return offer.map(offerMapper::toDto).orElse(null);
    }

    @Override
    public OfferDto createOffer(OfferDto offerDto) {
        Offer offer = offerMapper.toEntity(offerDto);
        Offer saved = offerRepository.save(offer);
        return offerMapper.toDto(saved);

    }

    @Override
    public OfferDto updateOffer(Long id, OfferDto offerDto) {
        Optional<Offer> optionalOffer = offerRepository.findById(id);
        if (optionalOffer.isPresent()) {
            Offer offer = optionalOffer.get();
            offer.setName(offerDto.getName());
            offer.setExplanation(offerDto.getExplanation());
            offer.setStartDate(offerDto.getStartDate());
            offer.setFinishDate(offerDto.getFinishDate());
            offer.setPrice(offerDto.getPrice());
            offer.setFitnessCenterId(offerDto.getFitnessCenterId());
            Offer updated = offerRepository.save(offer);
            return offerMapper.toDto(updated);
        } else {
            return null;
        }
    }

    @Override
    public void deleteOffer(Long id) {
        offerRepository.deleteById(id);
    }
}
