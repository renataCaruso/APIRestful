package org.serratec.java2backend.crudLista.crudLista.service;

import java.util.ArrayList;
import java.util.List;
import org.serratec.java2backend.crudLista.crudLista.model.CrudLista;
import org.springframework.stereotype.Service;

@Service
public class CrudListaService {
	
	List<CrudLista> lista = new ArrayList<>();

	public void adicionar(CrudLista crudLista) {
		lista.add(crudLista);

	}

	public List<CrudLista> listaCrudLista() {
		return this.lista;
	}

	public void atualizar(int itemLista, CrudLista todoDaApi) {
		CrudLista todoDaListaSalva = new CrudLista();
		
		todoDaListaSalva = lista.get(itemLista);

		todoDaListaSalva.setId(todoDaApi.getId());
		todoDaListaSalva.setMusica(todoDaApi.getMusica());
		todoDaListaSalva.setArtista(todoDaApi.getArtista());

	}

	public void deletar(int itemLista) {
		lista.remove(itemLista);
	}

}