/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira;

import br.com.herissonnogueira.carros.ICar;
import br.com.herissonnogueira.factory.IFactory;
import br.com.herissonnogueira.factory.SedanFactory;
import br.com.herissonnogueira.factory.TeslaFactory;

public class Cliente {

    public static void main(String[] args) {
        IFactory sedanFactory = new SedanFactory();
        IFactory teslaFactory = new TeslaFactory();

        ICar clienteSedanCar = sedanFactory.criarCarro();
        clienteSedanCar.exibirInformacoes();

        ICar clienteTeslaCar = teslaFactory.criarCarro();
        clienteTeslaCar.exibirInformacoes();
    }
}
