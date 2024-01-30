package br.com.herissonnogueira;

public class Calculo {
    public static void main(String[] args) {
        calculoMedia();
    }
    
    public static void calculoMedia() {
        int nota1 = 10;
        int nota2 = 20;
        int nota3 = 30;
        int nota4 = 40;
        int total = nota1 + nota2 + nota3 + nota4;
        System.out.println(total);

        int dividir = 4;
        System.out.println(total / dividir);
    }
}
