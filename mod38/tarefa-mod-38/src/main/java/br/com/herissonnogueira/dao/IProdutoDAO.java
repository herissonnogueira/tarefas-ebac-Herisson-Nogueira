/**
 * 
 */
package br.com.herissonnogueira.dao;

import java.util.List;

import br.com.herissonnogueira.dao.generic.IGenericDAO;
import br.com.herissonnogueira.domain.Produto;

/**
 * @author herisson.nogueira
 *
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
