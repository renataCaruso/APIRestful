package org.serratec.backend.livraria.Livraria.repository;

import org.serratec.backend.livraria.Livraria.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Integer> {

}
