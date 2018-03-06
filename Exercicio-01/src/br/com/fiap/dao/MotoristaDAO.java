package br.com.fiap.dao;

import br.com.fiap.dao.exception.CommitException;
import br.com.fiap.dao.exception.NotFoundException;
import br.com.fiap.entity.Motorista;

public interface MotoristaDAO {

	void create(Motorista motorista);
	
	Motorista find(int codigo);
	
	void update (Motorista motorista);
	
	void commit() throws CommitException;
	
	void delete(int codigo) throws NotFoundException;
}
