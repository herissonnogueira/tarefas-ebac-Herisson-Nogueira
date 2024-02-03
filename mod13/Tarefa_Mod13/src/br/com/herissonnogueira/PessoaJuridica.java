/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira;

public class PessoaJuridica extends Pessoa {


    @Override
    public String tipoString() {
        return getCpf();
    }
}
