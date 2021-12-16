package minibanking.dao;

import java.util.List;

import minibanking.model.Overbooking;

public interface OverbookingDAO {

	void addOverBooking (Overbooking overbooking);
	List<Overbooking> getAllPost();
}
