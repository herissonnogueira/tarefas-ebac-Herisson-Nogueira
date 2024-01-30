package br.com.herissonnogueira;

/**
 * @author herisson.nogueira
 */

public class PrimeiraClasse {
    public static void main(String[] args) {
        // Criando as definições do carro Tesla
        Carro tesla = new Carro();
        tesla.modelo = "Tesla";
        tesla.marca = "Tesla";
        tesla.fabricante = "Tesla";
        tesla.ligar();
        tesla.acelerar();
        tesla.frear();
        tesla.desligar();
        System.out.println("Nome do carro: " + tesla.modelo);

        // Criando as definições do carro Gol
        Carro gol = new Carro();
        gol.modelo = "Gol";
        gol.marca = "Volkswagen";
        gol.fabricante = "Volkswagen";
        gol.ligar();
        gol.acelerar();
        gol.frear();
        gol.desligar();
        System.out.println("Nome do carro: " + gol.modelo);
    }
}
