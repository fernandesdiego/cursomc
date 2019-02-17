package com.diegof.cursomc.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.diegof.cursomc.domain.Categoria;

@Repository
public interface PagamentoRepository extends JpaRepository<Categoria, Integer>{
	
}
