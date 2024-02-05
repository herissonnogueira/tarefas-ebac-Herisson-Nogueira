/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.factory;

import br.com.herissonnogueira.carros.ICar;
import br.com.herissonnogueira.carros.Tesla;

public class TeslaFactory implements IFactory {

    @Override
    public ICar criarCarro() {
        return new Tesla();
    }
}
