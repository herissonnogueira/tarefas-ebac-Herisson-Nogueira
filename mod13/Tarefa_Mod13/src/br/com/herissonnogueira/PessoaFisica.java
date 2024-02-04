/**
 * @author herisson.nogueira
 * Classe que representa uma pessoa física, estendendo a classe Pessoa
 * Possui um atributo 'cpf' e implementa o método abstrato 'tipoString()' da classe mãe
 */

package br.com.herissonnogueira;

public class PessoaFisica extends Pessoa {
    
    private String cpf;

     /**
     * Implementação do método abstrato da classe mãe
     * Retorna o CPF da pessoa física
     *
     * @return O CPF da pessoa física
     */
    @Override
    public String tipoString() {
        return getCpf();
    }

    /**
     * Retorna o CPF da pessoa física
     *
     * @return O CPF da pessoa física
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF da pessoa física
     *
     * @param cpf O novo CPF da pessoa física
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
