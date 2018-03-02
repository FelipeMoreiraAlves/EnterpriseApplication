package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Carro;
import br.com.fiap.jpa.exception.CarNotFoundException;
import br.com.fiap.jpa.exception.CommitException;

public interface CarroDAO {

	void create(Carro carro);
	
	void update(Carro carro);
	
	Carro find(int codigo);
	
	void delete(int codigo) throws CarNotFoundException;
	
	void commit() throws CommitException;
}
