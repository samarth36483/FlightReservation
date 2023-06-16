package com.samarth.flightreservation.Controller;



import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.samarth.flightreservation.flight.Flight;
import com.samarth.flightreservation.repos.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	FlightRepository flightRepository;
	
	@RequestMapping("searchFlights")
	public String searchFlights(@RequestParam("from")String from, @RequestParam("to")String to, @RequestParam("departureDate")String departureDate, ModelMap modelMap) throws Exception {

		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date date = sdf1.parse(departureDate);
			java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
			
			List<Flight> flights = flightRepository.searchFlights(from, to, sqlStartDate);
			modelMap.addAttribute("flights", flights);
		}
		catch(Exception e) {
			throw e;
		}
		return "displayFlights";
	}

}
