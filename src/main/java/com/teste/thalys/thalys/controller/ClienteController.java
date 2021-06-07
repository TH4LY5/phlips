package com.teste.thalys.thalys.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.thalys.thalys.models.Cliente;
import com.teste.thalys.thalys.repository.ClienteRepository;
import com.teste.thalys.thalys.serviceInterface.ClienteServiceInterface;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value="/cliente")
public class ClienteController { 

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	ClienteServiceInterface clienteService;
	
	@GetMapping("/listar")
	public List<Cliente> listarPerfil(){
		return clienteRepository.findAll();
	}
	@GetMapping("/pesquisar")
	public List<Cliente> listar(){
		return clienteRepository.getListar();
	}
	
	
	@GetMapping("/buscarPorId/{id}")
	public Optional<Cliente> buscarPorId(@PathVariable("id") long id){
	 		return this.clienteRepository.findById(id);
	}
	
	@PostMapping("/incluir")
	public String cadastrarCliente(@RequestBody Cliente cliente) throws Exception {
		return clienteService.cadastrarCliente(cliente);
	}
	
	@PutMapping("/alterar")
	public Cliente alterar(@RequestBody Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Cliente cliente) {
		 this.clienteRepository.delete(cliente);
	}
	
	
	
}