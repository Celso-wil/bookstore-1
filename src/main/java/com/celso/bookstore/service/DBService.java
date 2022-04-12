package com.celso.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celso.bookstore.domain.Categoria;
import com.celso.bookstore.domain.Livro;
import com.celso.bookstore.repositories.CategoriaRepository;
import com.celso.bookstore.repositories.LivroRepository;

@Service

public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void InstanciaBaseDeDados() {

		Categoria cat1 = new Categoria(null, "informatica", "livros de ti");

		Livro l1 = new Livro(null, "batata magica", "roberto martins", "lorem ipsum", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));

	}

}
