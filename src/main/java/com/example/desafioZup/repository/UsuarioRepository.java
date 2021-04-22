package com.example.desafioZup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.desafioZup.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
			
}
