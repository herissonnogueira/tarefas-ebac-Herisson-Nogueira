package main.br.com.herissonnogueira.dao;

import main.br.com.herissonnogueira.domain.Carro;

public interface ICarroDAO {

    public Carro cadastrar(Carro carro);

	public Carro excluir(Carro carro);
    
}
