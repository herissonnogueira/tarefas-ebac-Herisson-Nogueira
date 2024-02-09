/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira;

@ITabela(nome = "Tabela Reflections")

public class App {

    public static void main(String[] args) {
        Class<?> classe = App.class;
        ITabela tabela = classe.getAnnotation(ITabela.class);

        if (tabela != null) {
            String nomeTabela = tabela.nome();
            System.out.println("Nome da tabela: " + nomeTabela);
        }
    }
}
