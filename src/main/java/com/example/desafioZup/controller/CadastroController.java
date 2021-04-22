package com.example.desafioZup.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafioZup.model.Cadastro;
import com.example.desafioZup.model.Usuario;
import com.example.desafioZup.repository.CadastroRepository;
import com.example.desafioZup.service.CadastroService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/endereco")
public class CadastroController {

	@Autowired
	private CadastroRepository repository;
	
	@Autowired
	private CadastroService service;
		
	@GetMapping
	public ResponseEntity<List<Cadastro>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Cadastro> getById(@PathVariable long id){
		
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
				
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Cadastro> Post(@RequestBody Cadastro cadastro){
		try{
			return ResponseEntity.status(HttpStatus.CREATED).body(service.CadastrarEndereco(cadastro));
		}catch(Exception e) {
			return ResponseEntity.badRequest().build();
		}
				
	}
		
	@PutMapping
	public ResponseEntity<Cadastro> put(@RequestBody Cadastro cadastro) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(cadastro));

	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
