package org.serratec.backend.projeto01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class Exercicio0 {

	@RequestMapping("/soma")
	public Double soma(@RequestParam Double num1, @RequestParam Double num2) {
		return num1 + num2;
	}
	
	@RequestMapping("/subtracao")
	public Double subtracao(@RequestParam Double num1, @RequestParam Double num2) {
		return num1 - num2;
	}
	
	@RequestMapping("/divisao")
	public Double divisao(@RequestParam Double num1, @RequestParam Double num2) {
		return num1 / num2;
	}
	
	@RequestMapping("/multiplicacao")
	public Double multiplicacao(@RequestParam Double num1, @RequestParam Double num2) {
		return num1 * num2;
	}
}