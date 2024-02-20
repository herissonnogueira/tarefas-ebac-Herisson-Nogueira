/**
 * 
 */
package br.com.herissonnogueira.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.herissonnogueira.dao.generic.GenericDAO;
import br.com.herissonnogueira.domain.Cliente;

/**
 * @author herisson.nogueira
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		TypedQuery<Cliente> tpQuery = 
				this.entityManager.createNamedQuery("Cliente.findByNome", this.persistenteClass);
		tpQuery.setParameter("nome", "%" + query + "%");
        return tpQuery.getResultList();
		
	}

}
