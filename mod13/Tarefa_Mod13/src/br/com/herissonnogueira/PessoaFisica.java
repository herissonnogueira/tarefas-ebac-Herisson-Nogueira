/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira;

public class PessoaFisica extends Pessoa {


    @Override
    public String tipoString() {
        return getCpf();
    }
}
