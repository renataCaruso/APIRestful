package org.serratec.java2backend.crudLista.crudLista.controller;

import java.util.List;
import org.serratec.java2backend.crudLista.crudLista.model.CrudLista;
import org.serratec.java2backend.crudLista.crudLista.service.CrudListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class CrudListaController {

	@Autowired
	CrudListaService crudListaService;
	

	@GetMapping("/lista")
	public List<CrudLista> getCrudLista() {
		return crudListaService.listaCrudLista();
	}
	
	@PostMapping("/adicionar")
	public void adicionar(@RequestBody CrudLista crudLista) {
		crudListaService.adicionar(crudLista);
	}
	
	@PutMapping("/atualizar")
	public void atualizar(@RequestParam Integer posicaoLista,@RequestBody CrudLista todoDaApi) {	
		crudListaService.atualizar(posicaoLista, todoDaApi);
	}
	
	@DeleteMapping("/delete/{posicaoLista}")
	public void deletar(@PathVariable int posicaoLista) {
		crudListaService.deletar(posicaoLista);
		
	}
}