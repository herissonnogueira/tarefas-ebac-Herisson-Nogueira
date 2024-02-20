/**
 * 
 */
package br.com.herissonnogueira.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.herissonnogueira.utils.ReplaceUtils;

/**
 * @author herisson.nogueira
 *
 */
public class ReplaceUtilsTest {

	@Test
	public void replaceCPF() {
		String cpf = "222.222.222-22";
		String newCpf = ReplaceUtils.replace(cpf, ".", "-");
		
		assertEquals(newCpf, "22222222222");
	}
	
	@Test
	public void replaceTel() {
		String tel = "(11) 99999-0000";
		String newtel = ReplaceUtils.replace(tel, "(", ")", " ", "-");
		
		assertEquals(newtel, "11999990000");
	}
}
