package com.springapp.mvc.controller;

import com.springapp.mvc.core.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/car")
@ResponseBody
public class CarController {
	@RequestMapping(value="/create/{row}",method = RequestMethod.GET)
	public String createCar(@PathVariable int row) {
		System.out.println("creando autitos....");
		Car thread = new Car(row);
		thread.start();
		return "creando autos..";
	}


}