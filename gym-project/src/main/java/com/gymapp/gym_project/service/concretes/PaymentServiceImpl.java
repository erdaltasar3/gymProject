package com.gymapp.gym_project.service.concretes;

import com.gymapp.gym_project.dto.PaymentDto;
import com.gymapp.gym_project.entity.Payment;
import com.gymapp.gym_project.mapper.PaymentMapper;
import com.gymapp.gym_project.repository.IPaymentRepository;
import com.gymapp.gym_project.service.abstracts.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final IPaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;

    public PaymentServiceImpl(IPaymentRepository paymentRepository, PaymentMapper paymentMapper) {
        this.paymentRepository = paymentRepository;
        this.paymentMapper = paymentMapper;
    }

    @Override
    public List<PaymentDto> getAllPayments() {
        return paymentRepository.findAll()
                .stream()
                .map(paymentMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PaymentDto getPaymentById(Long id) {
        Optional<Payment> payment = paymentRepository.findById(id);
        return payment.map(paymentMapper::toDto).orElse(null);
    }

    @Override
    public PaymentDto createPayment(PaymentDto paymentDto) {
        Payment payment = paymentMapper.toEntity(paymentDto);
        payment.setId(null);
        Payment saved = paymentRepository.save(payment);
        return paymentMapper.toDto(saved);
    }

    @Override
    public PaymentDto updatePayment(Long id, PaymentDto paymentDto) {
        Optional<Payment> optionalPayment = paymentRepository.findById(id);
        if (optionalPayment.isPresent()) {
            Payment payment = optionalPayment.get();
            payment.setIncome(paymentDto.isIncome());
            payment.setPrice(paymentDto.getPrice());
            payment.setFitnessCenterId(paymentDto.getFitnessCenterId());
            Payment updated = paymentRepository.save(payment);
            return paymentMapper.toDto(updated);
        } else {
            return null;
        }
    }

    @Override
    public void deletePayment(Long id) {

        paymentRepository.deleteById(id);
    }
}