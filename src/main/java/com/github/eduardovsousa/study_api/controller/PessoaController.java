package com.github.eduardovsousa.study_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.eduardovsousa.study_api.model.Pessoa;
import com.github.eduardovsousa.study_api.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService = new PessoaService();
	
	@GetMapping
	public List<Pessoa> listAll() {
		return pessoaService.list();
	}
	
	@PostMapping
	public Pessoa create(Pessoa pessoa) {
		return pessoaService.save(pessoa);
	}
	
	@PutMapping
	public Pessoa update(Pessoa pessoa) {
		return pessoaService.update(pessoa);
	}
	
	@DeleteMapping
	public void delete(Long id) {
		
	}
}
