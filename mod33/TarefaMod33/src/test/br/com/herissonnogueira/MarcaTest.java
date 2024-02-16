package test.br.com.herissonnogueira;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.br.com.herissonnogueira.dao.IMarcaDAO;
import main.br.com.herissonnogueira.dao.MarcaDAO;
import main.br.com.herissonnogueira.domain.Marca;

public class MarcaTest {
    
    private IMarcaDAO marcaDAO;
	
	public MarcaTest() {
		marcaDAO = new MarcaDAO();
	}
	
	@Test
	public void cadastrar() {
		Marca marca = new Marca();
		marca.setCodigo("COD3");
		marca.setNome("JEEP");
		marca = marcaDAO.cadastrar(marca);
		
		assertNotNull(marca);
		assertNotNull(marca.getId());
		
		marca = marcaDAO.excluir(marca);
		
	}
}
