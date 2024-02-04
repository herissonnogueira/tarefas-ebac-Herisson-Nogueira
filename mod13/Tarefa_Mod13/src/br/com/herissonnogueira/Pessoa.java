/**
 * @author herisson.nogueira
 * Classe abstrata que representa uma pessoa genérica
 * Possui um atributo 'nome' e métodos para acessar e modificar esse atributo
 * Contém um método abstrato 'tipoString()' que deve ser implementado pelas classes filhas
 */

package br.com.herissonnogueira;

public abstract class Pessoa {

    private String nome;

    /**
     * Método abstrato que deve ser implementado pelas classes filhas
     * Retorna uma representação do tipo da pessoa em forma de String
     *
     * @return Representação do tipo da pessoa
     */

    public abstract String tipoString();

    /**
     * Imprime o nome da pessoa no console
     */

    public void imprimirNomes() {
        System.out.println("Nome é " + this.nome);
    }

     /**
     * Retorna o nome da pessoa
     *
     * @return O nome da pessoa
     */

    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa
     *
     * @param nome O novo nome da pessoa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
