/**
 * 
 */
package br.com.herissonnogueira.dao;

import java.util.List;

import br.com.herissonnogueira.dao.generic.IGenericDAO;
import br.com.herissonnogueira.domain.Cliente;

/**
 * @author herisson.nogueira
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
