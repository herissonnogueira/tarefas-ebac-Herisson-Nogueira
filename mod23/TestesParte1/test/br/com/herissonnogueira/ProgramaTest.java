/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ProgramaTest {

    @Test
    public void testExibirSomenteMulheres() {
        List<Pessoa> listaPessoas = Programa.criarListaDePessoas();

        List<Pessoa> mulheres = Programa.filtrarMulheres(listaPessoas);

        for (Pessoa mulher : mulheres) {
            Assert.assertEquals("F", mulher.getSexo());
        }

        Assert.assertEquals(3, mulheres.size());
    }
}
