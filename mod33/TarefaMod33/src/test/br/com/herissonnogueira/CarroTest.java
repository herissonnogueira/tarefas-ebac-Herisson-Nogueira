package test.br.com.herissonnogueira;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.br.com.herissonnogueira.dao.CarroDAO;
import main.br.com.herissonnogueira.dao.ICarroDAO;
import main.br.com.herissonnogueira.dao.IMarcaDAO;
import main.br.com.herissonnogueira.dao.MarcaDAO;
import main.br.com.herissonnogueira.domain.Carro;
import main.br.com.herissonnogueira.domain.Marca;

public class CarroTest {

    private ICarroDAO carroDAO;
	
	private IMarcaDAO marcaDAO;
	
	public CarroTest() {
		carroDAO = new CarroDAO();
		marcaDAO = new MarcaDAO();
	}
	
	@Test
	public void cadastrar() {
		Marca marca = criarMarca("COD2");
		
		Carro carro = new Carro();
		carro.setCodigo("COD2");
		carro.setModelo("TESLA");
		carro.setMarca(marca);
		carro = carroDAO.cadastrar(carro);
		
		assertNotNull(carro);
		assertNotNull(carro.getId());
		
		marca = marcaDAO.excluir(marca);
		carro = carroDAO.excluir(carro);
	}

	private Marca criarMarca(String codigo) {
		Marca marca = new Marca();
		marca.setCodigo(codigo);
		marca.setNome("TESLA2");
		return marcaDAO.cadastrar(marca);
	}
    
}
