package org.serratec.backend.livraria.Livraria.service;

import java.util.List;
import java.util.Optional;

import org.serratec.backend.livraria.Livraria.model.Livro;
import org.serratec.backend.livraria.Livraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
	
	@Autowired
	LivroRepository livroRepository;
	
	
	public void adicionar(Livro livro) {
		livroRepository.save(livro);
	}
	
	public Livro buscar (Integer idLivro, String tituloLivro) {
		Optional<Livro> livro = livroRepository.findById(idLivro);
		
		Livro livroNaLista = new Livro();
		
		if(livro.isPresent()) {
			
			livroNaLista = livro.get();
		}
		return livroNaLista;
	}
		
	public void deletar(Livro livroNaLista) {
		livroRepository.delete(livroNaLista);
	}
	
	public List<Livro> listarTodos(){
		return livroRepository.findAll();
	}
	
	public void atualizar(Integer idLivro, Livro livro) {
		Optional<Livro> livroAtual = livroRepository.findById(idLivro);
		Livro livroNaLista = new Livro();		
				
	if (livroAtual.isPresent()) {
		livroNaLista = livroAtual.get();
		if(livro.getTituloLivro()!= null) {
		livroNaLista.setTituloLivro(livro.getTituloLivro());
		}
		if(livro.getTipoLivro()!= null) {
		livroNaLista.setTipoLivro(livro.getTipoLivro());
		}
		if(livro.getAutorLivro()!= null) {
		livroNaLista.setAutorLivro(livro.getAutorLivro());
		}
		if(livro.getDataPublicacao()!= null) {
			livroNaLista.setDataPublicacao(livro.getDataPublicacao());
		}
		
		livroRepository.save(livroNaLista);
		}
	}
}
