package org.serratec.conta.p4.proj4.controller;

import java.util.List;

import org.serratec.conta.p4.proj4.model.ContaBanco;
import org.serratec.conta.p4.proj4.service.ContaBancoService;
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
public class ContaBancoController {
	
	@Autowired
	ContaBancoService contaBancoService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<ContaBanco>> listaTodos(){
		return ResponseEntity.ok(contaBancoService.listarTodos());
	}
	
	@GetMapping("/conta/{numero}")
	public ResponseEntity<ContaBanco> buscar(@PathVariable Integer numero){
		return ResponseEntity.ok(contaBancoService.buscar(numero, null));
	}
	
	@PostMapping("/adicionar")
	public ResponseEntity<Void> adicionar(@RequestBody ContaBanco contaBanco){
		contaBancoService.adicionar(contaBanco);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar/{numero}")
	public ResponseEntity<Void> atualizar(@PathVariable Integer numero, char titular,@RequestBody ContaBanco contaBanco){
		contaBancoService.atualizar(numero, contaBanco);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	

}