package org.serratec.banco.projeto04.repository;

import org.serratec.banco.projeto04.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContaRepository extends JpaRepository<Conta,Integer>{

}
