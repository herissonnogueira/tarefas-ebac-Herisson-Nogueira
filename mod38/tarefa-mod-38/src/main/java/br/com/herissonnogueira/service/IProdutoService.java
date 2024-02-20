/**
 * 
 */
package br.com.herissonnogueira.service;

import java.util.List;

import br.com.herissonnogueira.domain.Produto;
import br.com.herissonnogueira.services.generic.IGenericService;

/**
 * @author herisson.nogueira
 *
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
