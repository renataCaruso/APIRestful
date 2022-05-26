package org.serratec.backend.livraria.Livraria.controller;

import java.util.List;

import org.serratec.backend.livraria.Livraria.model.Livro;
import org.serratec.backend.livraria.Livraria.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
public class LivroController {

	@Autowired
	LivroService livroService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Livro>> listarTodos(){
		return ResponseEntity.ok(livroService.listarTodos());
	}
	
	@GetMapping("/buscar/{idLivro}")
	public ResponseEntity<Livro> buscar(@PathVariable Integer idLivro,@RequestBody String livro){
		return ResponseEntity.ok(livroService.buscar(idLivro, livro));
	}
	
	@PostMapping("/adicionar")
	public ResponseEntity<Void> adicionar(@RequestBody Livro livro){
		livroService.adicionar(livro);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar/{idLivro}")
	public ResponseEntity<Void> atualizar(@PathVariable Integer idLivro,@RequestBody Livro livro){
		livroService.atualizar(idLivro, livro);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{idLivro}")
	public ResponseEntity<Void> deletar(@PathVariable Livro idLivro){
		livroService.deletar(idLivro);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	
	
}