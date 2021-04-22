package com.example.desafioZup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafioZup.model.Cadastro;
import com.example.desafioZup.repository.CadastroRepository;

@Service
public class CadastroService {

	@Autowired
	private CadastroRepository repository;
	
	public Cadastro CadastrarEndereco(Cadastro cadastro){
		
		return repository.save(cadastro); 
	}
	
}
