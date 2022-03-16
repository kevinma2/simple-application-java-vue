package com.produtos.apiprojectrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apiprojectrest.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	Produto findById(int id);
	
}
