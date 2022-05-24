package org.serratec.banco.projeto04.controller;

import java.util.List;

import org.serratec.banco.projeto04.model.Conta;
import org.serratec.banco.projeto04.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class ContaController {

	@Autowired
	ContaService contaService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Conta>> listaTodos(){
		return ResponseEntity.ok(contaService.listarTodos());
	}
	
	@GetMapping("/conta/{numero}")
	public ResponseEntity<Conta> buscar(@PathVariable Integer numero){
		return ResponseEntity.ok(contaService.buscar(numero, null));
	}
	
	@PostMapping("/adicionar")
	public ResponseEntity<Void> adicionar(@RequestBody Conta conta){
		contaService.adicionar(conta);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar/{numero}")
	public ResponseEntity<Void> atualizar(@PathVariable Integer numero, char titular,@RequestBody Conta conta){
		contaService.atualizar(numero, conta);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	
	
}
