package minibanking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import minibanking.dao.OverbookingDAO;
import minibanking.model.Overbooking;

@Service
@Transactional(readOnly = true)
public class OverbookingServiceImpl implements OverbookingService {

    @Autowired
    private OverbookingDAO overBookingDAO;
    
	@Override
	@Transactional(readOnly = false)
	public void addOverBooking(Overbooking overbooking) {
		overBookingDAO.addOverBooking(overbooking);
	}

}
