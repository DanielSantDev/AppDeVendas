package br.com.danielsantdev.services;

import br.com.danielsantdev.dao.IProdutoDAO;
import br.com.danielsantdev.domain.Produto;
import br.com.danielsantdev.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
