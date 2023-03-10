package com.github.eduardovsousa.study_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.eduardovsousa.study_api.model.Pessoa;
import com.github.eduardovsousa.study_api.repository.PessoaRepository;

@Service
public class PessoaService {

	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<Pessoa> list() {
		return pessoaRepository.findAll();
	}
	
	public Pessoa save(Pessoa pessoa){
		return pessoaRepository.save(pessoa);
	}
	
	public Pessoa update(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
}
