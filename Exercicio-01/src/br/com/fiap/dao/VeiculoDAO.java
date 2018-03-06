package br.com.fiap.dao;

import br.com.fiap.dao.exception.CommitException;
import br.com.fiap.dao.exception.NotFoundException;
import br.com.fiap.entity.Veiculo;

public interface VeiculoDAO {
	void create(Veiculo veiculo);

	void update(Veiculo veiculo);

	Veiculo find(int codigo);

	void delete(int codigo) throws NotFoundException;
	
	void commit() throws CommitException;

}
