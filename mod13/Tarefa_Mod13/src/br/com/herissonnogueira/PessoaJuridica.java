/**
 * @author herisson.nogueira
 * Classe que representa uma pessoa jurídica, estendendo a classe Pessoa
 * Possui um atributo 'cnpj' e implementa o método abstrato 'tipoString()' da classe mãe
 */

package br.com.herissonnogueira;

public class PessoaJuridica extends Pessoa {


    private String cnpj;

     /**
     * Implementação do método abstrato da classe mãe
     * Retorna o CNPJ da pessoa jurídica
     *
     * @return O CNPJ da pessoa jurídica
     */
    @Override
    public String tipoString() {
        return getCnpj();
    }

    /**
     * Retorna o CNPJ da pessoa jurídica
     *
     * @return O CNPJ da pessoa jurídica
     */
    public String getCnpj() {
        return cnpj;
    }

     /**
     * Define o CNPJ da pessoa jurídica
     *
     * @param cnpj O novo CNPJ da pessoa jurídica
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
