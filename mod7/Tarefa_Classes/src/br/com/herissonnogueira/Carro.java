package br.com.herissonnogueira;

/**
 * @author herisson.nogueira
 */

public class Carro {
    // Atributos ou Características de um carro
    public String modelo;
    public String marca;
    public String fabricante;

    // Métodos ou ações de um carro
    public void ligar() {
        System.out.println("Carro ligado!");
    }

    public void desligar() {
        System.out.println("Carro desligado!");
    }

    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    public void frear() {
        System.out.println("Carro freando...");
    }
}
