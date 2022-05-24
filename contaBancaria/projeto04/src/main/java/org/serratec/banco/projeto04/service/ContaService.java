package org.serratec.banco.projeto04.service;

import java.util.List;
import java.util.Optional;
import org.serratec.banco.projeto04.model.Conta;
import org.serratec.banco.projeto04.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

	@Autowired
	ContaRepository contaRepository;
	
	public List<Conta> listarTodos(){
		return contaRepository.findAll();
	}
	
	public void adicionar(Conta conta) {
		contaRepository.save(conta);
	}
	
	public Conta buscar (Integer numero, String titular) {
		Optional<Conta> conta = contaRepository.findById(numero);
		
		Conta contaNoBanco = new Conta();
		
		if(conta.isPresent()) {
			
			contaNoBanco = conta.get();
		}
		return contaNoBanco;
	}
		
	public void atualizar(Integer numero, Conta conta) {
		Conta contaNoBanco = buscar (numero, null);
		
		if(contaNoBanco.getTitular()!= null) {
		contaNoBanco.setTitular(contaNoBanco.getTitular());
		}
		if(contaNoBanco.getNumero()!= null) {
		contaNoBanco.setNumero(contaNoBanco.getNumero());
		}
	
		contaRepository.save(contaNoBanco);	
	}
	
	public void delete(Conta contaNoBanco ) {
		contaRepository.delete(contaNoBanco);
	}
	
	
}
