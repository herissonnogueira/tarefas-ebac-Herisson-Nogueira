package main.br.com.herissonnogueira.dao;

import main.br.com.herissonnogueira.domain.Marca;

public interface IMarcaDAO {

    Marca cadastrar(Marca marca);

	Marca excluir(Marca marca);

    
}
