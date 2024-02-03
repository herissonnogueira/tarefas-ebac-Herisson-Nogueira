/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira;

public abstract class Pessoa {

    private String nome;

    private String cpf;

    private String cnpj;

    public abstract String tipoString();

    public void imprimirNomes() {
        System.out.println("Nome é " + this.nome );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
