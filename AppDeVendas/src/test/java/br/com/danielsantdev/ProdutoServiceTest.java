package br.com.danielsantdev;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.danielsantdev.dao.IProdutoDAO;
import br.com.danielsantdev.dao.ProdutoDaoMock;
import br.com.danielsantdev.domain.Produto;
import br.com.danielsantdev.exceptions.DAOException;
import br.com.danielsantdev.exceptions.TipoChaveNaoEncontradaException;
import br.com.danielsantdev.services.IProdutoService;
import br.com.danielsantdev.services.ProdutoService;

public class ProdutoServiceTest {

	private IProdutoService produtoService;
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
	}
	
	@Test
	public void pesquisar() throws DAOException {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() throws DAOException {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		produto.setNome("Daniel Santana");
		produtoService.alterar(produto);
		
		Assert.assertEquals("Daniel Santana", produto.getNome());
	}
}
