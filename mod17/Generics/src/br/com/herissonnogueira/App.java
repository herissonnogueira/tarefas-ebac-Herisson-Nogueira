/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        // Criando uma lista de Carro
        List<Carro> listaDeCarros = new ArrayList<>();

        // Adicionando diferentes tipos de carros na lista
        listaDeCarros.add(new Honda());
        listaDeCarros.add(new Jeep());
        listaDeCarros.add(new Tesla());

        // Exibindo detalhes de todos os carros na lista
        for (Carro carro : listaDeCarros) {
            carro.exibirDetalhes();
        }
    }
}
