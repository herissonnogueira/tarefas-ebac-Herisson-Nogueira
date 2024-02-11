/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira;

import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = criarListaDePessoas();

        System.out.println("Mulheres:");

        listaPessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("F"))
                .forEach(mulher -> {
                    System.out.println("Nome: " + mulher.getNome());
                    System.out.println("Sexo: " + mulher.getSexo());
                    System.out.println();
                });
    }

    private static List<Pessoa> criarListaDePessoas() {
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Herisson", "M"));
        lista.add(new Pessoa("Evllyn", "F"));
        lista.add(new Pessoa("Regina", "F"));
        lista.add(new Pessoa("Maria", "F"));
        lista.add(new Pessoa("João", "M"));
        lista.add(new Pessoa("José", "M"));
        return lista;
    }
}
