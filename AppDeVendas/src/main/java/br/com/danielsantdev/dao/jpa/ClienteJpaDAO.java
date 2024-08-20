package br.com.danielsantdev.dao.jpa;

import br.com.danielsantdev.dao.generic.jpa.GenericJpaDAO;
import br.com.danielsantdev.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
