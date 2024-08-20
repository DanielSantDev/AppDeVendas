package br.com.danielsantdev.services;

import br.com.danielsantdev.domain.Cliente;
import br.com.danielsantdev.exceptions.DAOException;
import br.com.danielsantdev.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
