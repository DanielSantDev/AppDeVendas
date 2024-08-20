package br.com.danielsantdev.dao;

import br.com.danielsantdev.dao.generic.IGenericDAO;
import br.com.danielsantdev.domain.Venda;
import br.com.danielsantdev.exceptions.DAOException;
import br.com.danielsantdev.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
