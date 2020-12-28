package com.calcBackend.calculator.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.calcBackend.calculator.services.*;

@RestController
@CrossOrigin
//@RequestMapping("/api")
public class CalcController {
	private final CalculatorServices CalculatorServices;
	
	@Autowired
	public CalcController(CalculatorServices CalculatorServices) {
		this.CalculatorServices=CalculatorServices;
	}
	
	/*@GetMapping(path = "{eq}")
	public String calculate(@PathVariable("eq") String equation) {
		return this.CalculatorServices.calcEquation(equation);
	}*/
	@GetMapping()
	@ResponseBody
	public String calculate(@RequestParam("f1") String first,@RequestParam("op") String operator,@RequestParam("s2") String second) {
		return this.CalculatorServices.calcEquation(first,operator,second);
	}
	
	
	
}
