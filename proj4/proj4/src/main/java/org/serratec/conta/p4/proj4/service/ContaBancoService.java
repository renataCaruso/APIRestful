package org.serratec.conta.p4.proj4.service;

import java.util.List;
import java.util.Optional;

import org.serratec.conta.p4.proj4.model.ContaBanco;
import org.serratec.conta.p4.proj4.repository.ContaBancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaBancoService {
	@Autowired
	ContaBancoRepository contaBancoRepository;
	
	public List<ContaBanco> listarTodos(){
		return contaBancoRepository.findAll();
	}
	
	public void adicionar(ContaBanco contaBanco) {
		contaBancoRepository.save(contaBanco);
	}
	
	
	public ContaBanco buscar (Integer numero, String titular) {
		Optional<ContaBanco> conta = contaBancoRepository.findById(numero);
		
		ContaBanco contaNoBanco = new ContaBanco();
		
		if(conta.isPresent()) {
			
			contaNoBanco = conta.get();
		}
		return contaNoBanco;
	}
		
	public void atualizar(Integer numero, ContaBanco contaBanco) {
		ContaBanco contaNoBanco = buscar (numero, null);
		
		if(contaNoBanco.getTitular()!= null) {
		contaNoBanco.setTitular(contaNoBanco.getTitular());
		}
		if(contaNoBanco.getNumero()!= null) {
		contaNoBanco.setNumero(contaNoBanco.getNumero());
		}
	
		contaBancoRepository.save(contaNoBanco);	
	}
	
	public void delete(ContaBanco contaNoBanco ) {
		contaBancoRepository.delete(contaNoBanco);
	}

}
