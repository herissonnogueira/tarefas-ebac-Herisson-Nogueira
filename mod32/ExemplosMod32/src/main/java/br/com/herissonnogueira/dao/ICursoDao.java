package br.com.herissonnogueira.dao;

import java.util.List;

import br.com.herissonnogueira.domain.Curso;

/**
 * @author herisson.nogueira
 *
 */

public interface ICursoDao {

	public Curso cadastrar(Curso curso);

	public void excluir(Curso cur);

	public List<Curso> buscarTodos();
}
