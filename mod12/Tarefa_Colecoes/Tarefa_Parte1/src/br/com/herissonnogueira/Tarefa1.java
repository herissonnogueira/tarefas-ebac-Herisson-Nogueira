/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Tarefa1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por ,  ");

        String input = s.nextLine();
        String[] nomes = input.split(",");

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        Collator collator = Collator.getInstance(new Locale("pt", "BR"));
        Arrays.sort(nomes, collator);
        
        System.out.println("Nomes em ordem alfabética: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
