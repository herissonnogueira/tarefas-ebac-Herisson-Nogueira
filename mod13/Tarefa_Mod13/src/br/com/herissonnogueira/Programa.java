/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira;

public class Programa {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Pessoa Física");
        pessoaFisica.setCpf("1");
        imprimir(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Pessoa Jurídica");
        pessoaJuridica.setCnpj("2");
        imprimir(pessoaJuridica);
    }

    public static void imprimir(Pessoa pessoa) {
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
