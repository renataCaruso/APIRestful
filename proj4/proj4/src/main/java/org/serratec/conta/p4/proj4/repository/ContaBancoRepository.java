package org.serratec.conta.p4.proj4.repository;

import org.serratec.conta.p4.proj4.model.ContaBanco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaBancoRepository extends JpaRepository<ContaBanco,Integer>{

}
