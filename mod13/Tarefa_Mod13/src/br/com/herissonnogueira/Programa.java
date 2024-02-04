/**
 * @author herisson.nogueira
 * Classe principal que contém o método 'main' para execução do programa
 * Cria instâncias de PessoaFisica e PessoaJuridica, define seus atributos e chama o método 'imprimir'
 */

package br.com.herissonnogueira;

public class Programa {

    public static void main(String[] args) {
        // Criando uma instância de PessoaFisica e definindo seus atributos
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Pessoa Física");
        pessoaFisica.setCpf("1");

        // Chamando o método 'imprimir' para exibir os dados da pessoa física
        imprimir(pessoaFisica);

        // Criando uma instância de PessoaJuridica e definindo seus atributos
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Pessoa Jurídica");
        pessoaJuridica.setCnpj("2");

        // Chamando o método 'imprimir' para exibir os dados da pessoa jurídica
        imprimir(pessoaJuridica);
    }

    /**
     * Imprime os dados da pessoa (física ou jurídica) no console
     *
     * @param pessoa Objeto da classe Pessoa a ser impresso
     */
    public static void imprimir(Pessoa pessoa) {
        // Verifica o tipo de pessoa e imprime os dados correspondentes
        if (pessoa instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica) pessoa;
            System.out.println("Nome: " + pf.getNome());
            System.out.println("CPF: " + pf.getCpf());
        } else if (pessoa instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica) pessoa;
            System.out.println("Nome: " + pj.getNome());
            System.out.println("CNPJ: " + pj.getCnpj());
        } else {
            System.out.println("Tipo de pessoa desconhecido");
        }
    }
}
