package com.example.desafioZup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.desafioZup.model.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long>{
	
}
