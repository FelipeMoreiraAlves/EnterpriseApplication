package br.com.fiap.dao;

import br.com.fiap.dao.exception.CommitException;
import br.com.fiap.dao.exception.NotFoundException;
import br.com.fiap.entity.Motorista;

public interface GenericDAO<T,K> {

	void create(T entidade);
	
	void update(T entidade);
	
	void delete(K codigo) throws NotFoundException;
	
	T find(K codigo);
	
	void commit() throws CommitException;

	
	

	
}
