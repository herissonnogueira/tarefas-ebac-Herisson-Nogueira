package main.br.com.herissonnogueira.dao;

import main.br.com.herissonnogueira.domain.Acessorio;

public interface IAcessorioDAO {

    Acessorio cadastrar(Acessorio acessorio);

	Acessorio excluir(Acessorio acessorio);
    
}
