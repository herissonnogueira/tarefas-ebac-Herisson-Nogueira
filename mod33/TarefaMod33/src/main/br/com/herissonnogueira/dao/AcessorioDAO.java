package main.br.com.herissonnogueira.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.br.com.herissonnogueira.domain.Acessorio;

public class AcessorioDAO implements IAcessorioDAO {

    @Override
	public Acessorio cadastrar(Acessorio acessorio) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("TarefaEBAC");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();		
		entityManager.persist(acessorio);	
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		entityManagerFactory.close();
		
		return acessorio;
	}

	@Override
	public Acessorio excluir(Acessorio acessorio) {
		EntityManagerFactory entityManagerFactory = 
                Persistence.createEntityManagerFactory("TarefaEBAC");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
 
        entityManager.createNativeQuery("DROP TABLE IF EXISTS Acessorio CASCADE").executeUpdate();
               
        entityManager.getTransaction().commit();

        entityManager.clear();
        entityManagerFactory.close();
        
		return acessorio;
	}
    
}
