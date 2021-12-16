package minibanking.service;

import org.springframework.stereotype.Service;

import minibanking.model.Overbooking;

@Service
public interface OverbookingService {
    void addOverBooking(Overbooking overbooking);
}
