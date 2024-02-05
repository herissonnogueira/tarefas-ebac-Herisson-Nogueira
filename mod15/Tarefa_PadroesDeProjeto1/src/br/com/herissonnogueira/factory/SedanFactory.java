/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.factory;

import br.com.herissonnogueira.carros.ICar;
import br.com.herissonnogueira.carros.Sedan;

public class SedanFactory implements IFactory {

    @Override
    public ICar criarCarro() {
        return new Sedan();
    }
}
