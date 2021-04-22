package com.example.desafioZup.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.desafioZup.model.Usuario;
import com.example.desafioZup.repository.UsuarioRepository;


@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	
	public Usuario CadastrarUsuario(Usuario usuario){
									
		return repository.save(usuario);
		
	}

}
