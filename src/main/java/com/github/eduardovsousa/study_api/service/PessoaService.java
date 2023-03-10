package com.github.eduardovsousa.study_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.eduardovsousa.study_api.model.Pessoa;

@Service
public class PessoaService {
	private List<Pessoa> pessoas;
	
	public PessoaService() {
		load();
	}
 	
	private void load() {
		pessoas = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1l);
		pessoa.setNome("Eduardo");
		pessoa.setIdade(26);
		pessoas.add(pessoa);
		
		pessoa = new Pessoa();
		pessoa.setId(2l);
		pessoa.setNome("Ellen");
		pessoa.setIdade(25);
		pessoas.add(pessoa);

		pessoa = new Pessoa();
		pessoa.setId(3l);
		pessoa.setNome("Theo");
		pessoa.setIdade(6);
		pessoas.add(pessoa);
	}
	
	public List<Pessoa> list() {
		return pessoas;
	}
}
