package br.com.danielsantdev.dao.jpa;

import br.com.danielsantdev.dao.generic.jpa.GenericJpaDAO;
import br.com.danielsantdev.domain.jpa.ProdutoJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
