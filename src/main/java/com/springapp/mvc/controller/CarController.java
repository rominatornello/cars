package com.springapp.mvc.controller;

import com.springapp.mvc.core.Car;
import com.springapp.mvc.core.Position;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
@RequestMapping("/car")
public class CarController {

	@RequestMapping(value="/create/",method = RequestMethod.GET)
	public String createCar() {
		System.out.println("creando autitos....");
		Random generator = new Random();
		int row = generator.nextInt(3);

		//int row = (int) (Math.random()%3);
		Car thread = new Car(row);
		thread.start();
		System.out.print("la fila es " + row);
		return "redirect:/index.html";
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Position[][] getMap(){
		return Car.map;
	}

}