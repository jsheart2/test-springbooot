package minibanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import minibanking.model.Overbooking;
import minibanking.service.OverbookingService;

@RestController
@RequestMapping("/overbooking")
public class OverbookingController {

    @Autowired
    private OverbookingService overbookingService;
    
	 @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	    public void addOverBooking(@RequestBody Overbooking overbooking) {
	        overbookingService.addOverBooking(overbooking);
	    }
}
