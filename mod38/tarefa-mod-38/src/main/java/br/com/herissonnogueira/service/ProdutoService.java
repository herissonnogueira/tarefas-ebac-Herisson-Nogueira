/**
 * 
 */
package br.com.herissonnogueira.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.herissonnogueira.dao.IProdutoDAO;
import br.com.herissonnogueira.domain.Produto;
import br.com.herissonnogueira.services.generic.GenericService;

/**
 * @author herisson.nogueira
 *
 */
@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
