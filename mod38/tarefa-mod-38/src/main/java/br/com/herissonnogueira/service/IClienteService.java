/**
 * 
 */
package br.com.herissonnogueira.service;

import java.util.List;

import br.com.herissonnogueira.domain.Cliente;
import br.com.herissonnogueira.exceptions.DAOException;
import br.com.herissonnogueira.services.generic.IGenericService;

/**
 * @author herisson.nogueira
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
