package com.teste.thalys.thalys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.teste.thalys.thalys.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	@Query(value="select tb.* from TB_CLIENTE tb " + 
			"WHERE ATIVO = 1",nativeQuery = true)
	public List<Cliente> getListar();
	
	@Query(value="select COUNT(*) from TB_CLIENTE WHERE CPF like ?1 ",nativeQuery = true)
	public Integer verificarCPF(String cpf);
}
