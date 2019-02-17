package com.diegof.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.diegof.cursomc.domain.Cidade;

@Repository
public interface EstadoRepository extends JpaRepository<Cidade, Integer>{
	
}
