package com.qintess.produto.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.produto.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Produto findById(long id);
	
}
